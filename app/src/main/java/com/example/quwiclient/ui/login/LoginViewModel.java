package com.example.quwiclient.ui.login;

import android.text.TextUtils;

import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.ui.base.BaseViewModel;
import com.example.quwiclient.utils.CommonUtils;
import com.example.quwiclient.utils.rx.SchedulerProvider;

public class LoginViewModel extends BaseViewModel<LoginNavigator> {

    public LoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public boolean isEmailAndPasswordValid(String email, String password) {
        // validate email and password
        if (TextUtils.isEmpty(email)) {
            return false;
        }
        if (!CommonUtils.isEmailValid(email)) {
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            return false;
        }
        return true;
    }

    public void login(String email, String password) {
//        getCompositeDisposable().add(getDataManager()
//                .doServerLoginApiCall(new LoginRequest.ServerLoginRequest(email, password))
//                .doOnSuccess(response -> getDataManager()
//                        .updateUserInfo(
//                                response.getAccessToken(),
//                                response.getUserId(),
//                                DataManager.LoggedInMode.LOGGED_IN_MODE_SERVER,
//                                response.getUserName(),
//                                response.getUserEmail(),
//                                response.getGoogleProfilePicUrl()))
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(response -> {
//                    setIsLoading(false);
//                    getNavigator().openMainActivity();
//                }, throwable -> {
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }




    public void onServerLoginClick() {
        getNavigator().login();
    }
}
