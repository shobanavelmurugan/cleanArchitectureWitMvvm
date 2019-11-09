package com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.model.User;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry.UserRepositry;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class UserViewModel extends ViewModel {
    public MutableLiveData<User> userMutableLiveData;
    private UserRepositry userRepositry;
  public UserViewModel(){
    userRepositry=new UserRepositry();
    userMutableLiveData=userRepositry.getUserMutableLiveData();
  }
    public void callData(){
        userRepositry=new UserRepositry();
        userMutableLiveData=userRepositry.getUserMutableLiveData();
    }
}
