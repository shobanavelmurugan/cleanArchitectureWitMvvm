package com.ibot.cyranosystems.cleanarchitecturewitmvvm.domain;

import androidx.lifecycle.MutableLiveData;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry.CallBackTwoRepositry;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class CallBackTwoImpl implements CallBackTwo {
    private CallBackTwoRepositry callBackTwoRepositry;
    private MutableLiveData<String> data;
    @Override
    public MutableLiveData<String> getData() {
        callBackTwoRepositry=new CallBackTwoRepositry();
       data=callBackTwoRepositry.getData();
        return data;
    }
}
