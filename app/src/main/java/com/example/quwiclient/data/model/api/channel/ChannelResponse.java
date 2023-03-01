
package com.example.quwiclient.data.model.api.channel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ChannelResponse {

    @SerializedName("channels")
    private List<Channel> mChannels;

    public List<Channel> getChannels() {
        return mChannels;
    }

    public void setChannels(List<Channel> channels) {
        mChannels = channels;
    }

}
