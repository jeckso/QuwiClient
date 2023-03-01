
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class UserSettings {

    @SerializedName("cache_updated")
    private Boolean mCacheUpdated;
    @SerializedName("client_settings")
    private ClientSettings mClientSettings;
    @SerializedName("dta_mute_until")
    private Object mDtaMuteUntil;
    @SerializedName("is_mute_chats")
    private Boolean mIsMuteChats;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("mute_until_period")
    private Long mMuteUntilPeriod;

    public Boolean getCacheUpdated() {
        return mCacheUpdated;
    }

    public void setCacheUpdated(Boolean cacheUpdated) {
        mCacheUpdated = cacheUpdated;
    }

    public ClientSettings getClientSettings() {
        return mClientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        mClientSettings = clientSettings;
    }

    public Object getDtaMuteUntil() {
        return mDtaMuteUntil;
    }

    public void setDtaMuteUntil(Object dtaMuteUntil) {
        mDtaMuteUntil = dtaMuteUntil;
    }

    public Boolean getIsMuteChats() {
        return mIsMuteChats;
    }

    public void setIsMuteChats(Boolean isMuteChats) {
        mIsMuteChats = isMuteChats;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public Long getMuteUntilPeriod() {
        return mMuteUntilPeriod;
    }

    public void setMuteUntilPeriod(Long muteUntilPeriod) {
        mMuteUntilPeriod = muteUntilPeriod;
    }

}
