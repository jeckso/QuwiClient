package com.example.quwiclient.ui.main;

public interface MainNavigator {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}