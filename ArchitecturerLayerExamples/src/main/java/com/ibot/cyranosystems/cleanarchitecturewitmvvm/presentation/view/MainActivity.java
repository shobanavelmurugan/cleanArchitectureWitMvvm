package com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.R;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.model.User;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.databinding.ActivityMainBinding;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.presenter.UserPresenter;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel.CallBackOneViewModel;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel.CallBackTwoViewModel;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel.UserViewModel;

/* App Reference: https://www.youtube.com/watch?v=G_UFfOO8E5s */

public class MainActivity extends AppCompatActivity {
    private UserViewModel userViewModel;
    private ActivityMainBinding activityMainBinding;
    private CallBackOneViewModel callBackOneViewModel;
    private CallBackTwoViewModel callBackTwoViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        callViewModels();
        callActions();
    }

    private void callActions() {
        activityMainBinding.setPresenter(new UserPresenter() {
            @Override
            public void onClick() {
                userViewModel.callData();
                userViewModel.userMutableLiveData.observe(MainActivity.this, new Observer<User>() {
                    @Override
                    public void onChanged(User user) {
                        activityMainBinding.txtView.setText(user.getName());
                    }
                });
                callBackOneViewModel.stringMutableLiveData.observe(MainActivity.this, new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Log.d("First Approach Value is:",s);
                    }
                });
                callBackTwoViewModel.data.observe(MainActivity.this, new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Log.d("Second Approach Value is:",s);
                    }
                });
            }
        });
    }

    private void callViewModels() {
        userViewModel=new UserViewModel();
        userViewModel.userMutableLiveData.observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                // activityMainBinding.txtView.setText(user.getName());
                Log.d("UserName:",user.getName());
            }
        });
        /* First approach*/
        callBackOneViewModel=new CallBackOneViewModel();
        callBackOneViewModel.stringMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("Value is:",s);
            }
        });
        /* Second approach*/
        callBackTwoViewModel=new CallBackTwoViewModel();
    }
}
