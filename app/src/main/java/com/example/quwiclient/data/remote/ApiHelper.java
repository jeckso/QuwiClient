package com.example.quwiclient.data.remote;

import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.LoginResponse;
import com.example.quwiclient.data.model.api.channel.ChannelResponse;
import com.example.quwiclient.data.model.api.user.UserResponse;

import java.util.List;

import io.reactivex.Single;

public interface ApiHelper {



//    Single<LogoutResponse> doLogoutApiCall();
//
    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

   Single<ChannelResponse> getChannelsApiCall();
   Single<UserResponse> getUsersApiCall(List<String> users);



//    Single<OpenSourceResponse> getOpenSourceApiCall();
}
