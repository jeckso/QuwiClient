package com.example.quwiclient.data.remote;

import com.example.quwiclient.BuildConfig;

public final class ApiEndPoint {

    public static final String ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "auth/login";
    public static final String ENDPOINT_SERVER_LOGOUT = BuildConfig.BASE_URL + "auth/logout";
    public static final String ENDPOINT_CHANNELS = BuildConfig.BASE_URL + "chat-channels";
    public static final String ENDPOINT_USERS = BuildConfig.BASE_URL + "users/foreign";

    private ApiEndPoint() {
    }
}
