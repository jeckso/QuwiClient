package com.example.quwiclient.di.component;

import com.example.quwiclient.di.module.ActivityModule;
import com.example.quwiclient.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {

//    void inject(FeedActivity activity);


}