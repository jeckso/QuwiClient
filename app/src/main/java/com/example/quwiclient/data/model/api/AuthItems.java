
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AuthItems {

    @SerializedName("can_edit_time")
    private Boolean mCanEditTime;
    @SerializedName("chat")
    private Boolean mChat;
    @SerializedName("coder")
    private Boolean mCoder;
    @SerializedName("disc_space")
    private Boolean mDiscSpace;
    @SerializedName("instant_screen")
    private Boolean mInstantScreen;
    @SerializedName("is_free")
    private Boolean mIsFree;
    @SerializedName("member_area")
    private Boolean mMemberArea;
    @SerializedName("owner")
    private Boolean mOwner;
    @SerializedName("screens_month")
    private Boolean mScreensMonth;
    @SerializedName("timelapse_video")
    private Boolean mTimelapseVideo;
    @SerializedName("tracked_timer_month")
    private Boolean mTrackedTimerMonth;
    @SerializedName("trial")
    private Boolean mTrial;

    public Boolean getCanEditTime() {
        return mCanEditTime;
    }

    public void setCanEditTime(Boolean canEditTime) {
        mCanEditTime = canEditTime;
    }

    public Boolean getChat() {
        return mChat;
    }

    public void setChat(Boolean chat) {
        mChat = chat;
    }

    public Boolean getCoder() {
        return mCoder;
    }

    public void setCoder(Boolean coder) {
        mCoder = coder;
    }

    public Boolean getDiscSpace() {
        return mDiscSpace;
    }

    public void setDiscSpace(Boolean discSpace) {
        mDiscSpace = discSpace;
    }

    public Boolean getInstantScreen() {
        return mInstantScreen;
    }

    public void setInstantScreen(Boolean instantScreen) {
        mInstantScreen = instantScreen;
    }

    public Boolean getIsFree() {
        return mIsFree;
    }

    public void setIsFree(Boolean isFree) {
        mIsFree = isFree;
    }

    public Boolean getMemberArea() {
        return mMemberArea;
    }

    public void setMemberArea(Boolean memberArea) {
        mMemberArea = memberArea;
    }

    public Boolean getOwner() {
        return mOwner;
    }

    public void setOwner(Boolean owner) {
        mOwner = owner;
    }

    public Boolean getScreensMonth() {
        return mScreensMonth;
    }

    public void setScreensMonth(Boolean screensMonth) {
        mScreensMonth = screensMonth;
    }

    public Boolean getTimelapseVideo() {
        return mTimelapseVideo;
    }

    public void setTimelapseVideo(Boolean timelapseVideo) {
        mTimelapseVideo = timelapseVideo;
    }

    public Boolean getTrackedTimerMonth() {
        return mTrackedTimerMonth;
    }

    public void setTrackedTimerMonth(Boolean trackedTimerMonth) {
        mTrackedTimerMonth = trackedTimerMonth;
    }

    public Boolean getTrial() {
        return mTrial;
    }

    public void setTrial(Boolean trial) {
        mTrial = trial;
    }

}
