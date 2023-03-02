
package com.example.quwiclient.data.model.api.channel;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MessageLast {

    @SerializedName("dta_create")
    private String mDtaCreate;
    @SerializedName("dta_create_utc")
    private String mDtaCreateUtc;
    @SerializedName("file")
    private Object mFile;
    @SerializedName("id")
    private Long mId;
    @SerializedName("id_channel")
    private Long mIdChannel;
    @SerializedName("id_user")
    private Long mIdUser;
    @SerializedName("is_edited")
    private Boolean mIsEdited;
    @SerializedName("is_read")
    private Long mIsRead;
    @SerializedName("is_starred")
    private Boolean mIsStarred;
    @SerializedName("reply_on")
    private Object mReplyOn;
    @SerializedName("snippet")
    private String mSnippet;
    @SerializedName("text")
    private String mText;
    @SerializedName("user")
    private User mUser;

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

    public Object getFile() {
        return mFile;
    }

    public void setFile(Object file) {
        mFile = file;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getIdChannel() {
        return mIdChannel;
    }

    public void setIdChannel(Long idChannel) {
        mIdChannel = idChannel;
    }

    public Long getIdUser() {
        return mIdUser;
    }

    public void setIdUser(Long idUser) {
        mIdUser = idUser;
    }

    public Boolean getIsEdited() {
        return mIsEdited;
    }

    public void setIsEdited(Boolean isEdited) {
        mIsEdited = isEdited;
    }

    public Long getIsRead() {
        return mIsRead;
    }

    public void setIsRead(Long isRead) {
        mIsRead = isRead;
    }

    public Boolean getIsStarred() {
        return mIsStarred;
    }

    public void setIsStarred(Boolean isStarred) {
        mIsStarred = isStarred;
    }

    public Object getReplyOn() {
        return mReplyOn;
    }

    public void setReplyOn(Object replyOn) {
        mReplyOn = replyOn;
    }

    public String getSnippet() {
        return mSnippet;
    }

    public void setSnippet(String snippet) {
        mSnippet = snippet;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

}
