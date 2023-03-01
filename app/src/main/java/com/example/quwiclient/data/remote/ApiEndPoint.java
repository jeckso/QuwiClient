package com.example.quwiclient.data.remote;

import com.example.quwiclient.BuildConfig;

public final class ApiEndPoint {

    public static final String ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "auth/login";
    public static final String ENDPOINT_CHANNELS = BuildConfig.BASE_URL + "chat-channels";

    private ApiEndPoint() {
    }
}
