
package com.example.quwiclient.data.model.api;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class User {

    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("dta_activity")
    private String mDtaActivity;
    @SerializedName("dta_create")
    private String mDtaCreate;
    @SerializedName("dta_timer_activity")
    private Object mDtaTimerActivity;
    @SerializedName("due_penalties")
    private Long mDuePenalties;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("id")
    private Long mId;
    @SerializedName("id_company")
    private Long mIdCompany;
    @SerializedName("is_active")
    private Boolean mIsActive;
    @SerializedName("is_chat_email_notification")
    private Boolean mIsChatEmailNotification;
    @SerializedName("is_online")
    private Long mIsOnline;
    @SerializedName("is_shared_from_me")
    private Boolean mIsSharedFromMe;
    @SerializedName("is_telegram_connected")
    private Boolean mIsTelegramConnected;
    @SerializedName("is_timer_online")
    private Long mIsTimerOnline;
    @SerializedName("name")
    private String mName;
    @SerializedName("nick")
    private String mNick;
    @SerializedName("projects")
    private List<Object> mProjects;
    @SerializedName("role")
    private String mRole;
    @SerializedName("telegram_connect_url")
    private String mTelegramConnectUrl;
    @SerializedName("timer_last")
    private Object mTimerLast;
    @SerializedName("timezone_offset")
    private Long mTimezoneOffset;

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
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

    public Object getDtaTimerActivity() {
        return mDtaTimerActivity;
    }

    public void setDtaTimerActivity(Object dtaTimerActivity) {
        mDtaTimerActivity = dtaTimerActivity;
    }

    public Long getDuePenalties() {
        return mDuePenalties;
    }

    public void setDuePenalties(Long duePenalties) {
        mDuePenalties = duePenalties;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getIdCompany() {
        return mIdCompany;
    }

    public void setIdCompany(Long idCompany) {
        mIdCompany = idCompany;
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

    public Boolean getIsSharedFromMe() {
        return mIsSharedFromMe;
    }

    public void setIsSharedFromMe(Boolean isSharedFromMe) {
        mIsSharedFromMe = isSharedFromMe;
    }

    public Boolean getIsTelegramConnected() {
        return mIsTelegramConnected;
    }

    public void setIsTelegramConnected(Boolean isTelegramConnected) {
        mIsTelegramConnected = isTelegramConnected;
    }

    public Long getIsTimerOnline() {
        return mIsTimerOnline;
    }

    public void setIsTimerOnline(Long isTimerOnline) {
        mIsTimerOnline = isTimerOnline;
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

    public List<Object> getProjects() {
        return mProjects;
    }

    public void setProjects(List<Object> projects) {
        mProjects = projects;
    }

    public String getRole() {
        return mRole;
    }

    public void setRole(String role) {
        mRole = role;
    }

    public String getTelegramConnectUrl() {
        return mTelegramConnectUrl;
    }

    public void setTelegramConnectUrl(String telegramConnectUrl) {
        mTelegramConnectUrl = telegramConnectUrl;
    }

    public Object getTimerLast() {
        return mTimerLast;
    }

    public void setTimerLast(Object timerLast) {
        mTimerLast = timerLast;
    }

    public Long getTimezoneOffset() {
        return mTimezoneOffset;
    }

    public void setTimezoneOffset(Long timezoneOffset) {
        mTimezoneOffset = timezoneOffset;
    }

}
