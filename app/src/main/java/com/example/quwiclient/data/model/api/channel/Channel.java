
package com.example.quwiclient.data.model.api.channel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Channel {

    @SerializedName("custom_info")
    private Object mCustomInfo;
    @SerializedName("draft")
    private Draft mDraft;
    @SerializedName("dta_change_msg")
    private String mDtaChangeMsg;
    @SerializedName("dta_change_msg_utc")
    private String mDtaChangeMsgUtc;
    @SerializedName("dta_create")
    private String mDtaCreate;
    @SerializedName("dta_create_utc")
    private String mDtaCreateUtc;
    @SerializedName("dta_last_read")
    private String mDtaLastRead;
    @SerializedName("dta_last_read_utc")
    private String mDtaLastReadUtc;
    @SerializedName("dta_pin")
    private Object mDtaPin;
    @SerializedName("id")
    private Long mId;
    @SerializedName("id_partner")
    private Long mIdPartner;
    @SerializedName("id_project")
    private Object mIdProject;
    @SerializedName("id_users")
    private List<Long> mIdUsers;
    @SerializedName("is_hide_in_chats_list")
    private Boolean mIsHideInChatsList;
    @SerializedName("is_mute")
    private Boolean mIsMute;
    @SerializedName("is_starred")
    private Boolean mIsStarred;
    @SerializedName("is_unread_manual")
    private Boolean mIsUnreadManual;
    @SerializedName("message_last")
    private Object mMessageLast;
    @SerializedName("mute_until_period")
    private Long mMuteUntilPeriod;
    @SerializedName("pin_to_top")
    private Boolean mPinToTop;
    @SerializedName("type")
    private String mType;

    public Object getCustomInfo() {
        return mCustomInfo;
    }

    public void setCustomInfo(Object customInfo) {
        mCustomInfo = customInfo;
    }

    public Draft getDraft() {
        return mDraft;
    }

    public void setDraft(Draft draft) {
        mDraft = draft;
    }

    public String getDtaChangeMsg() {
        return mDtaChangeMsg;
    }

    public void setDtaChangeMsg(String dtaChangeMsg) {
        mDtaChangeMsg = dtaChangeMsg;
    }

    public String getDtaChangeMsgUtc() {
        return mDtaChangeMsgUtc;
    }

    public void setDtaChangeMsgUtc(String dtaChangeMsgUtc) {
        mDtaChangeMsgUtc = dtaChangeMsgUtc;
    }

    public String getDtaCreate() {
        return mDtaCreate;
    }

    public void setDtaCreate(String dtaCreate) {
        mDtaCreate = dtaCreate;
    }

    public String getDtaCreateUtc() {
        return mDtaCreateUtc;
    }

    public void setDtaCreateUtc(String dtaCreateUtc) {
        mDtaCreateUtc = dtaCreateUtc;
    }

    public String getDtaLastRead() {
        return mDtaLastRead;
    }

    public void setDtaLastRead(String dtaLastRead) {
        mDtaLastRead = dtaLastRead;
    }

    public String getDtaLastReadUtc() {
        return mDtaLastReadUtc;
    }

    public void setDtaLastReadUtc(String dtaLastReadUtc) {
        mDtaLastReadUtc = dtaLastReadUtc;
    }

    public Object getDtaPin() {
        return mDtaPin;
    }

    public void setDtaPin(Object dtaPin) {
        mDtaPin = dtaPin;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getIdPartner() {
        return mIdPartner;
    }

    public void setIdPartner(Long idPartner) {
        mIdPartner = idPartner;
    }

    public Object getIdProject() {
        return mIdProject;
    }

    public void setIdProject(Object idProject) {
        mIdProject = idProject;
    }

    public List<Long> getIdUsers() {
        return mIdUsers;
    }

    public void setIdUsers(List<Long> idUsers) {
        mIdUsers = idUsers;
    }

    public Boolean getIsHideInChatsList() {
        return mIsHideInChatsList;
    }

    public void setIsHideInChatsList(Boolean isHideInChatsList) {
        mIsHideInChatsList = isHideInChatsList;
    }

    public Boolean getIsMute() {
        return mIsMute;
    }

    public void setIsMute(Boolean isMute) {
        mIsMute = isMute;
    }

    public Boolean getIsStarred() {
        return mIsStarred;
    }

    public void setIsStarred(Boolean isStarred) {
        mIsStarred = isStarred;
    }

    public Boolean getIsUnreadManual() {
        return mIsUnreadManual;
    }

    public void setIsUnreadManual(Boolean isUnreadManual) {
        mIsUnreadManual = isUnreadManual;
    }

    public Object getMessageLast() {
        return mMessageLast;
    }

    public void setMessageLast(Object messageLast) {
        mMessageLast = messageLast;
    }

    public Long getMuteUntilPeriod() {
        return mMuteUntilPeriod;
    }

    public void setMuteUntilPeriod(Long muteUntilPeriod) {
        mMuteUntilPeriod = muteUntilPeriod;
    }

    public Boolean getPinToTop() {
        return mPinToTop;
    }

    public void setPinToTop(Boolean pinToTop) {
        mPinToTop = pinToTop;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
