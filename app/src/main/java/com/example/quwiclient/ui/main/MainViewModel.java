package com.example.quwiclient.ui.main;

import android.text.TextUtils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.quwiclient.R;
import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.channel.Channel;
import com.example.quwiclient.data.model.api.user.User;
import com.example.quwiclient.ui.base.BaseViewModel;
import com.example.quwiclient.ui.login.LoginNavigator;
import com.example.quwiclient.utils.CommonUtils;
import com.example.quwiclient.utils.rx.SchedulerProvider;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainViewModel extends BaseViewModel<MainNavigator> {

    private final MutableLiveData<List<Channel>> channelListLiveData;
    private final MutableLiveData<List<User>> usersListLiveData;

    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        channelListLiveData = new MutableLiveData<>();
        usersListLiveData = new MutableLiveData<>();
        fetchChannels();
    }

    public void fetchChannels() {
        getCompositeDisposable().add(getDataManager()
                .getChannelsApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(channelResponse -> {
                    if (channelResponse != null && channelResponse.getChannels() != null) {
                        fetchUsers(channelResponse.getChannels());
                    }
                }, throwable -> {
                    getNavigator().handleError(throwable);
                }));
    }

    public void fetchUsers(List<Channel> channels) {
        List<String> idPartnerList = channels.stream()
                .map(obj -> obj.getIdPartner().toString())
                .collect(Collectors.toList());

        getCompositeDisposable().add(getDataManager()
                .getUsersApiCall(idPartnerList)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(userResponse -> {
                    if (userResponse != null && userResponse.getUsers() != null) {
                        Map<Long, User> userMap = userResponse.getUsers().stream()
                                .collect(Collectors.toMap(User::getId, Function.identity()));
                        usersListLiveData.setValue(userResponse.getUsers());
                        List<Channel> updatedChannels = channels.stream()
                                .map(channel -> {
                                    Long currentId = getDataManager().getCurrentUserId();
                                    User user = userMap.get(channel.getIdPartner());
                                    if (user != null) {
                                        channel.setUser(new com.example.quwiclient.data.model.api.channel.User());
                                        if (currentId.equals(channel.getIdPartner())) {
                                            channel.getUser().setName("Saved Messages");
                                        } else {
                                            channel.getUser().setName(user.getName());
                                        }
                                        channel.getUser().setAvatarUrl(user.getAvatarUrl());
                                    }
                                    return channel;
                                })
                                .collect(Collectors.toList());
                        channelListLiveData.setValue(updatedChannels);
                    }
                }, throwable -> {
                    getNavigator().handleError(throwable);
                }));
    }

    public LiveData<List<Channel>> getBlogListLiveData() {
        return channelListLiveData;
    }

}
