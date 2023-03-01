package com.example.quwiclient.di.module;

import androidx.core.util.Supplier;
import androidx.lifecycle.ViewModelProvider;

import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.ui.base.BaseActivity;
import com.example.quwiclient.ui.login.LoginViewModel;
import com.example.quwiclient.ui.splash.SplashViewModel;
import com.example.quwiclient.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private BaseActivity<?, ?> activity;

    public ActivityModule(BaseActivity<?, ?> activity) {
        this.activity = activity;
    }

    @Provides
    LoginViewModel provideLoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<LoginViewModel> supplier = () -> new LoginViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<LoginViewModel> factory = new ViewModelProviderFactory<>(LoginViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(LoginViewModel.class);
    }

    @Provides
    SplashViewModel provideSplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<SplashViewModel> supplier = () -> new SplashViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<SplashViewModel> factory = new ViewModelProviderFactory<>(SplashViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(SplashViewModel.class);
    }

}