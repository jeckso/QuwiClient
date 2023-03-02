package com.example.quwiclient.di.component;

import com.example.quwiclient.di.module.ActivityModule;
import com.example.quwiclient.di.scope.ActivityScope;
import com.example.quwiclient.ui.login.LoginActivity;
import com.example.quwiclient.ui.main.MainActivity;
import com.example.quwiclient.ui.splash.SplashActivity;

import dagger.Component;

@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

    void inject(LoginActivity activity);

    void inject(SplashActivity splashActivity);
    void inject(MainActivity mainActivity);


}