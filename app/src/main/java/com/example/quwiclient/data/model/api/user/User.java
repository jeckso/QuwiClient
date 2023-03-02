
package com.example.quwiclient.data.model.api.user;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class User {

    @SerializedName("avatar_url")
    private Object mAvatarUrl;
    @SerializedName("dta_activity")
    private String mDtaActivity;
    @SerializedName("dta_create")
    private String mDtaCreate;
    @SerializedName("id")
    private Long mId;
    @SerializedName("is_active")
    private Boolean mIsActive;
    @SerializedName("is_chat_email_notification")
    private Boolean mIsChatEmailNotification;
    @SerializedName("is_online")
    private Long mIsOnline;
    @SerializedName("name")
    private String mName;
    @SerializedName("nick")
    private String mNick;
    @SerializedName("timezone_offset")
    private Long mTimezoneOffset;

    public Object getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(Object avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public String getDtaActivity() {
        return mDtaActivity;
    }

    public void setDtaActivity(String dtaActivity) {
        mDtaActivity = dtaActivity;
    }

    public String getDtaCreate() {
        return mDtaCreate;
    }

    public void setDtaCreate(String dtaCreate) {
        mDtaCreate = dtaCreate;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getIsActive() {
        return mIsActive;
    }

    public void setIsActive(Boolean isActive) {
        mIsActive = isActive;
    }

    public Boolean getIsChatEmailNotification() {
        return mIsChatEmailNotification;
    }

    public void setIsChatEmailNotification(Boolean isChatEmailNotification) {
        mIsChatEmailNotification = isChatEmailNotification;
    }

    public Long getIsOnline() {
        return mIsOnline;
    }

    public void setIsOnline(Long isOnline) {
        mIsOnline = isOnline;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNick() {
        return mNick;
    }

    public void setNick(String nick) {
        mNick = nick;
    }

    public Long getTimezoneOffset() {
        return mTimezoneOffset;
    }

    public void setTimezoneOffset(Long timezoneOffset) {
        mTimezoneOffset = timezoneOffset;
    }

}
