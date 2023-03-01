package com.example.quwiclient.ui.main.channel.adapter;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.quwiclient.data.model.api.channel.Channel;
import com.example.quwiclient.data.model.api.channel.ChannelResponse;
import com.example.quwiclient.databinding.ItemChatChannelBinding;
import com.example.quwiclient.ui.base.BaseViewHolder;
import com.example.quwiclient.utils.AppLogger;

import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Channel> mBlogResponseList;


    public ChannelAdapter(List<Channel> blogResponseList) {
        this.mBlogResponseList = blogResponseList;
    }

    @Override
    public int getItemCount() {
        if (mBlogResponseList != null && mBlogResponseList.size() > 0) {
            return mBlogResponseList.size();
        } else {
            return 1;
        }
    }



    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemChatChannelBinding blogViewBinding = ItemChatChannelBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new ChannelViewHolder(blogViewBinding);
    }

    public void addItems(List<Channel> blogList) {
        mBlogResponseList.addAll(blogList);
        notifyDataSetChanged();
    }

    public void clearItems() {
        mBlogResponseList.clear();
    }

    public class ChannelViewHolder extends BaseViewHolder {

        private ItemChatChannelBinding mBinding;


        public ChannelViewHolder(ItemChatChannelBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        @Override
        public void onBind(int position) {
            final Channel blog = mBlogResponseList.get(position);

        }

    }

}