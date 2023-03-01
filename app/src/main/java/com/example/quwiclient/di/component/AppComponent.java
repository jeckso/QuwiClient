package com.example.quwiclient.di.component;
import android.app.Application;

import com.example.quwiclient.App;
import com.example.quwiclient.data.DataManager;
import com.example.quwiclient.di.module.AppModule;
import com.example.quwiclient.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(App app);

    DataManager getDataManager();

    SchedulerProvider getSchedulerProvider();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}