package com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry;

import androidx.lifecycle.MutableLiveData;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.model.User;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class UserRepositry {
    private MutableLiveData<User> userMutableLiveData=new MutableLiveData<>();
    private User user;
    public UserRepositry(){
    }

    public MutableLiveData<User> getUserMutableLiveData() {
        user=new User("shobana");
        userMutableLiveData.setValue(user);
        return userMutableLiveData;
    }
}
