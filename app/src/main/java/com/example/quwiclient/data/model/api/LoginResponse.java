
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LoginResponse {

    @SerializedName("already_join_project")
    private Object mAlreadyJoinProject;
    @SerializedName("app_init")
    private AppInit mAppInit;
    @SerializedName("token")
    private String mToken;

    public Object getAlreadyJoinProject() {
        return mAlreadyJoinProject;
    }

    public void setAlreadyJoinProject(Object alreadyJoinProject) {
        mAlreadyJoinProject = alreadyJoinProject;
    }

    public AppInit getAppInit() {
        return mAppInit;
    }

    public void setAppInit(AppInit appInit) {
        mAppInit = appInit;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        mToken = token;
    }

}
