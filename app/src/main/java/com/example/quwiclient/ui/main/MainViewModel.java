package com.example.quwiclient.ui.main;

import android.text.TextUtils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.channel.Channel;
import com.example.quwiclient.ui.base.BaseViewModel;
import com.example.quwiclient.ui.login.LoginNavigator;
import com.example.quwiclient.utils.CommonUtils;
import com.example.quwiclient.utils.rx.SchedulerProvider;

import java.util.List;

public class MainViewModel extends BaseViewModel<MainNavigator> {

    private final MutableLiveData<List<Channel>> channelListLiveData;

    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
        channelListLiveData = new MutableLiveData<>();
        fetchChannels();
    }

    public void fetchChannels() {
        getCompositeDisposable().add(getDataManager()
                .getChannelsApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(channelResponse -> {
                    if (channelResponse != null && channelResponse.getChannels() != null) {
                        channelListLiveData.setValue(channelResponse.getChannels());
                    }
                }, throwable -> {
                    getNavigator().handleError(throwable);
                }));
    }
    public LiveData<List<Channel>> getBlogListLiveData() {
        return channelListLiveData;
    }

}
