package com.example.quwiclient.di.module;

import com.example.quwiclient.ui.base.BaseActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private BaseActivity<?, ?> activity;

    public ActivityModule(BaseActivity<?, ?> activity) {
        this.activity = activity;
    }



}