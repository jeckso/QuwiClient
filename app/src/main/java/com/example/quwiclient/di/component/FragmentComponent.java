package com.example.quwiclient.di.component;

import com.example.quwiclient.di.module.FragmentModule;
import com.example.quwiclient.di.scope.FragmentScope;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {

}
