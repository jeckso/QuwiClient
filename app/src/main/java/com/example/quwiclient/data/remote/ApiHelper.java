package com.example.quwiclient.data.remote;

import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.LoginResponse;

import io.reactivex.Single;

public interface ApiHelper {



//    Single<LogoutResponse> doLogoutApiCall();
//
    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();
//
//    Single<BlogResponse> getBlogApiCall();
//
//    Single<OpenSourceResponse> getOpenSourceApiCall();
}
