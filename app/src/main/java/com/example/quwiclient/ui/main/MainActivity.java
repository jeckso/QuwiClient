package com.example.quwiclient.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.quwiclient.R;
import com.example.quwiclient.data.model.api.channel.Channel;
import com.example.quwiclient.databinding.ActivityMainBinding;
import com.example.quwiclient.di.component.ActivityComponent;
import com.example.quwiclient.ui.base.BaseActivity;
import com.example.quwiclient.ui.login.LoginActivity;
import com.example.quwiclient.ui.main.channel.adapter.ChannelAdapter;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> implements MainNavigator {

    private ActivityMainBinding binding;

    @Inject
    ChannelAdapter mChannelAdapter;

    @Inject
    LinearLayoutManager mLayoutManager;

    public static Intent newIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }


    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void login() {

    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(MainActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        mViewModel.setNavigator(this);
        setSupportActionBar(binding.toolbarBase);

        final Observer<List<Channel>> channelObserver = new Observer<List<Channel>>() {
            @Override
            public void onChanged(@Nullable final List<Channel> channels) {
                mChannelAdapter.addItems(channels);
                setUp();
            }
        };

        mViewModel.getBlogListLiveData().observe(this, channelObserver);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_logout, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (getSupportActionBar() != null) {
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_logout) {
            mViewModel.logout();
            return true;
        } else return super.onOptionsItemSelected(item);
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

    private void setUp() {
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        binding.rvChatChannels.setAdapter(mChannelAdapter);
    }


}
