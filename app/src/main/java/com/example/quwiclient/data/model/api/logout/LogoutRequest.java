
package com.example.quwiclient.data.model.api.logout;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LogoutRequest {

    @SerializedName("anywhere")
    private Boolean mAnywhere;

    public LogoutRequest(Boolean mAnywhere) {
        this.mAnywhere = mAnywhere;
    }

    public Boolean getAnywhere() {
        return mAnywhere;
    }

    public void setAnywhere(Boolean anywhere) {
        mAnywhere = anywhere;
    }

}
