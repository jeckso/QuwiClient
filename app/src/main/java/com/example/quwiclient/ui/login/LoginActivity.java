package com.example.quwiclient.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quwiclient.databinding.ActivityLoginBinding;
import com.example.quwiclient.databinding.ActivitySplashBinding;
import com.example.quwiclient.di.component.ActivityComponent;
import com.example.quwiclient.ui.base.BaseActivity;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> implements LoginNavigator {

    private ActivitySplashBinding binding;

    public static Intent newIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }


    @Override
    public void handleError(Throwable throwable) {
        // handle error
    }

    @Override
    public void login() {
//        String email = mActivityLoginBinding.etEmail.getText().toString();
//        String password = mActivityLoginBinding.etPassword.getText().toString();
//        if (mViewModel.isEmailAndPasswordValid(email, password)) {
//            hideKeyboard();
//            mViewModel.login(email, password);
//        } else {
//            Toast.makeText(this, getString(R.string.invalid_email_password), Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public void openMainActivity() {
        Intent intent = LoginActivity.newIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        mViewModel.setNavigator(this);
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }


}