package com.example.quwiclient.ui.splash;

import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.ui.base.BaseViewModel;
import com.example.quwiclient.utils.rx.SchedulerProvider;

public class SplashViewModel extends BaseViewModel<SplashNavigator> {

    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

//    public void startSeeding() {
//        getCompositeDisposable().add(getDataManager()
//                .seedDatabaseQuestions()
//                .flatMap(aBoolean -> getDataManager().seedDatabaseOptions())
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(aBoolean -> {
//                    decideNextActivity();
//                }, throwable -> {
//                    decideNextActivity();
//                }));
//    }

    private void decideNextActivity() {
        if (getDataManager().getCurrentUserLoggedInMode() == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {
            getNavigator().openLoginActivity();
        } else {
            getNavigator().openMainActivity();
        }
    }
}