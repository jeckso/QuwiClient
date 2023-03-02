package com.example.quwiclient.data.remote;

import com.example.quwiclient.data.model.api.LoginRequest;
import com.example.quwiclient.data.model.api.LoginResponse;
import com.example.quwiclient.data.model.api.channel.ChannelResponse;
import com.example.quwiclient.data.model.api.logout.LogoutRequest;
import com.example.quwiclient.data.model.api.logout.LogoutResponse;
import com.example.quwiclient.data.model.api.user.UserResponse;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    //    @Override
//    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request) {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_FACEBOOK_LOGIN)
//                .addHeaders(mApiHeader.getPublicApiHeader())
//                .addBodyParameter(request)
//                .build()
//                .getObjectSingle(LoginResponse.class);
//    }
//
//    @Override
//    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request) {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_GOOGLE_LOGIN)
//                .addHeaders(mApiHeader.getPublicApiHeader())
//                .addBodyParameter(request)
//                .build()
//                .getObjectSingle(LoginResponse.class);
//    }
//
//    @Override
//    public Single<LogoutResponse> doLogoutApiCall() {
//        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_LOGOUT)
//                .addHeaders(mApiHeader.getProtectedApiHeader())
//                .build()
//                .getObjectSingle(LogoutResponse.class);
//    }
//
    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
                .addHeaders(mApiHeader.getPublicApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(LoginResponse.class);
    }

    @Override
    public Single<Object> doLogoutApiCall(LogoutRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_SERVER_LOGOUT)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addBodyParameter(request)
                .build()
                .getObjectSingle(Object.class);
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }

    @Override
    public Single<ChannelResponse> getChannelsApiCall() {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_CHANNELS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .build()
                .getObjectSingle(ChannelResponse.class);
    }

    @Override
    public Single<UserResponse> getUsersApiCall(List<String> users) {
        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_USERS)
                .addHeaders(mApiHeader.getProtectedApiHeader())
                .addQueryParameter("ids", String.join(", ", users))
                .build()
                .getObjectSingle(UserResponse.class);
    }

//    @Override
//    public Single<OpenSourceResponse> getOpenSourceApiCall() {
//        return Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_OPEN_SOURCE)
//                .addHeaders(mApiHeader.getProtectedApiHeader())
//                .build()
//                .getObjectSingle(OpenSourceResponse.class);
//    }
}
