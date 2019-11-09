package com.ibot.cyranosystems.mvvmandroid;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.ibot.cyranosystems.mvvmandroid.commonds.UserLogin;
import com.ibot.cyranosystems.mvvmandroid.databinding.ActivityMainBinding;
import com.ibot.cyranosystems.mvvmandroid.model.User;
import com.ibot.cyranosystems.mvvmandroid.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
      setHintEdittext();
      callLoginEvent();
    }

    private void callLoginEvent() {
        activityMainBinding.setUserloginevent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,activityMainBinding.getLogin().getEmail(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setHintEdittext() {
        /* Databinding set Hint in Edittext*/
        UserModel userModel=new UserModel(new User("email","password"));
        activityMainBinding.setLogin(userModel);
    }
}
