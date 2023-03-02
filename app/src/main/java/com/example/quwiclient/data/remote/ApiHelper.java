package com.example.quwiclient.data.remote;

import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.LoginResponse;
import com.example.quwiclient.data.model.api.channel.ChannelResponse;
import com.example.quwiclient.data.model.api.logout.LogoutRequest;
import com.example.quwiclient.data.model.api.logout.LogoutResponse;
import com.example.quwiclient.data.model.api.user.UserResponse;

import java.util.List;
import java.util.Objects;

import io.reactivex.Single;

public interface ApiHelper {



//    Single<LogoutResponse> doLogoutApiCall();
//
    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

   Single<ChannelResponse> getChannelsApiCall();
   Single<UserResponse> getUsersApiCall(List<String> users);

   Single<Object> doLogoutApiCall(LogoutRequest request);





//    Single<OpenSourceResponse> getOpenSourceApiCall();
}
