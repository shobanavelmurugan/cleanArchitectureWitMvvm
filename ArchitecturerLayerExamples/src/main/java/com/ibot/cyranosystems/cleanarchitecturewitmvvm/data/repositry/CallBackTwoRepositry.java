package com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry;

import androidx.lifecycle.MutableLiveData;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class CallBackTwoRepositry {
    private MutableLiveData<String> data=new MutableLiveData<>();

    public CallBackTwoRepositry() {

    }

    public MutableLiveData<String> getData() {
        data.setValue("This is Second Approach");
        return data;
    }
}
