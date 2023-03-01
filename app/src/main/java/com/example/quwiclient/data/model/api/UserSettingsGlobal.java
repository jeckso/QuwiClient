
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

public class UserSettingsGlobal {

    @SerializedName("client_settings")
    private ClientSettings mClientSettings;
    @SerializedName("is_chat_email_notification")
    private Boolean mIsChatEmailNotification;

    public ClientSettings getClientSettings() {
        return mClientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        mClientSettings = clientSettings;
    }

    public Boolean getIsChatEmailNotification() {
        return mIsChatEmailNotification;
    }

    public void setIsChatEmailNotification(Boolean isChatEmailNotification) {
        mIsChatEmailNotification = isChatEmailNotification;
    }

}
