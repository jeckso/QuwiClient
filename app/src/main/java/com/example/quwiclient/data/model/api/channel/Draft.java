
package com.example.quwiclient.data.model.api.channel;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Draft {

    @SerializedName("dta_update")
    private Object mDtaUpdate;
    @SerializedName("dta_update_utc")
    private Object mDtaUpdateUtc;
    @SerializedName("id_reply")
    private Object mIdReply;
    @SerializedName("text")
    private Object mText;

    public Object getDtaUpdate() {
        return mDtaUpdate;
    }

    public void setDtaUpdate(Object dtaUpdate) {
        mDtaUpdate = dtaUpdate;
    }

    public Object getDtaUpdateUtc() {
        return mDtaUpdateUtc;
    }

    public void setDtaUpdateUtc(Object dtaUpdateUtc) {
        mDtaUpdateUtc = dtaUpdateUtc;
    }

    public Object getIdReply() {
        return mIdReply;
    }

    public void setIdReply(Object idReply) {
        mIdReply = idReply;
    }

    public Object getText() {
        return mText;
    }

    public void setText(Object text) {
        mText = text;
    }

}
