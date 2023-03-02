package com.example.quwiclient.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quwiclient.databinding.ActivitySplashBinding;
import com.example.quwiclient.di.component.ActivityComponent;
import com.example.quwiclient.ui.base.BaseActivity;
import com.example.quwiclient.ui.login.LoginActivity;
import com.example.quwiclient.ui.main.MainActivity;

public class SplashActivity extends BaseActivity<ActivitySplashBinding, SplashViewModel> implements SplashNavigator {

    private ActivitySplashBinding binding;


    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ;
        mViewModel.setNavigator(this);
        mViewModel.decideNextActivity();
    }


    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }
}
