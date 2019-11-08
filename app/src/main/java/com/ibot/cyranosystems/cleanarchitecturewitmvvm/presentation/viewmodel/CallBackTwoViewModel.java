package com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.domain.CallBackTwoImpl;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class CallBackTwoViewModel extends ViewModel {
    public MutableLiveData<String> data;
    CallBackTwoImpl callBackTwo;

    public CallBackTwoViewModel() {
        callBackTwo=new CallBackTwoImpl();
        data=callBackTwo.getData();
    }

    public MutableLiveData<String> getData() {
        data=callBackTwo.getData();
        return data;
    }
}
