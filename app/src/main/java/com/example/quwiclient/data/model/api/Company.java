
package com.example.quwiclient.data.model.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Company {

    @SerializedName("dta_create")
    private String mDtaCreate;
    @SerializedName("id")
    private Long mId;
    @SerializedName("id_user")
    private Long mIdUser;
    @SerializedName("is_my")
    private Boolean mIsMy;
    @SerializedName("is_plan_almost_used")
    private Boolean mIsPlanAlmostUsed;
    @SerializedName("logo_url")
    private String mLogoUrl;
    @SerializedName("max_file_count")
    private Long mMaxFileCount;
    @SerializedName("max_file_size")
    private Long mMaxFileSize;
    @SerializedName("name")
    private String mName;
    @SerializedName("owner_fullname")
    private String mOwnerFullname;
    @SerializedName("screens_interval")
    private Long mScreensInterval;
    @SerializedName("screens_quality")
    private Long mScreensQuality;
    @SerializedName("timezone")
    private String mTimezone;
    @SerializedName("timezone_offset")
    private Long mTimezoneOffset;
    @SerializedName("uid")
    private String mUid;
    @SerializedName("updated")
    private Long mUpdated;

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

    public Long getIdUser() {
        return mIdUser;
    }

    public void setIdUser(Long idUser) {
        mIdUser = idUser;
    }

    public Boolean getIsMy() {
        return mIsMy;
    }

    public void setIsMy(Boolean isMy) {
        mIsMy = isMy;
    }

    public Boolean getIsPlanAlmostUsed() {
        return mIsPlanAlmostUsed;
    }

    public void setIsPlanAlmostUsed(Boolean isPlanAlmostUsed) {
        mIsPlanAlmostUsed = isPlanAlmostUsed;
    }

    public String getLogoUrl() {
        return mLogoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        mLogoUrl = logoUrl;
    }

    public Long getMaxFileCount() {
        return mMaxFileCount;
    }

    public void setMaxFileCount(Long maxFileCount) {
        mMaxFileCount = maxFileCount;
    }

    public Long getMaxFileSize() {
        return mMaxFileSize;
    }

    public void setMaxFileSize(Long maxFileSize) {
        mMaxFileSize = maxFileSize;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOwnerFullname() {
        return mOwnerFullname;
    }

    public void setOwnerFullname(String ownerFullname) {
        mOwnerFullname = ownerFullname;
    }

    public Long getScreensInterval() {
        return mScreensInterval;
    }

    public void setScreensInterval(Long screensInterval) {
        mScreensInterval = screensInterval;
    }

    public Long getScreensQuality() {
        return mScreensQuality;
    }

    public void setScreensQuality(Long screensQuality) {
        mScreensQuality = screensQuality;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public Long getTimezoneOffset() {
        return mTimezoneOffset;
    }

    public void setTimezoneOffset(Long timezoneOffset) {
        mTimezoneOffset = timezoneOffset;
    }

    public String getUid() {
        return mUid;
    }

    public void setUid(String uid) {
        mUid = uid;
    }

    public Long getUpdated() {
        return mUpdated;
    }

    public void setUpdated(Long updated) {
        mUpdated = updated;
    }

}
