
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ClientSettings {

    @SerializedName("bell_autoopen")
    private Boolean mBellAutoopen;
    @SerializedName("cache_updated")
    private Boolean mCacheUpdated;
    @SerializedName("chat_active")
    private Boolean mChatActive;
    @SerializedName("comment_video_autoplay")
    private Boolean mCommentVideoAutoplay;
    @SerializedName("hash")
    private String mHash;

    public Boolean getBellAutoopen() {
        return mBellAutoopen;
    }

    public void setBellAutoopen(Boolean bellAutoopen) {
        mBellAutoopen = bellAutoopen;
    }

    public Boolean getCacheUpdated() {
        return mCacheUpdated;
    }

    public void setCacheUpdated(Boolean cacheUpdated) {
        mCacheUpdated = cacheUpdated;
    }

    public Boolean getChatActive() {
        return mChatActive;
    }

    public void setChatActive(Boolean chatActive) {
        mChatActive = chatActive;
    }

    public Boolean getCommentVideoAutoplay() {
        return mCommentVideoAutoplay;
    }

    public void setCommentVideoAutoplay(Boolean commentVideoAutoplay) {
        mCommentVideoAutoplay = commentVideoAutoplay;
    }

    public String getHash() {
        return mHash;
    }

    public void setHash(String hash) {
        mHash = hash;
    }

}
