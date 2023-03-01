
package com.example.quwiclient.data.model.api;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AppInit {

    @SerializedName("auth_items")
    private AuthItems mAuthItems;
    @SerializedName("chats_count_unread")
    private Long mChatsCountUnread;
    @SerializedName("companies")
    private List<Company> mCompanies;
    @SerializedName("hidden_projects")
    private List<Object> mHiddenProjects;
    @SerializedName("ip")
    private String mIp;
    @SerializedName("user")
    private User mUser;
    @SerializedName("user_settings")
    private UserSettings mUserSettings;
    @SerializedName("user_settings_global")
    private UserSettingsGlobal mUserSettingsGlobal;

    public AuthItems getAuthItems() {
        return mAuthItems;
    }

    public void setAuthItems(AuthItems authItems) {
        mAuthItems = authItems;
    }

    public Long getChatsCountUnread() {
        return mChatsCountUnread;
    }

    public void setChatsCountUnread(Long chatsCountUnread) {
        mChatsCountUnread = chatsCountUnread;
    }

    public List<Company> getCompanies() {
        return mCompanies;
    }

    public void setCompanies(List<Company> companies) {
        mCompanies = companies;
    }

    public List<Object> getHiddenProjects() {
        return mHiddenProjects;
    }

    public void setHiddenProjects(List<Object> hiddenProjects) {
        mHiddenProjects = hiddenProjects;
    }

    public String getIp() {
        return mIp;
    }

    public void setIp(String ip) {
        mIp = ip;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public UserSettings getUserSettings() {
        return mUserSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        mUserSettings = userSettings;
    }

    public UserSettingsGlobal getUserSettingsGlobal() {
        return mUserSettingsGlobal;
    }

    public void setUserSettingsGlobal(UserSettingsGlobal userSettingsGlobal) {
        mUserSettingsGlobal = userSettingsGlobal;
    }

}
