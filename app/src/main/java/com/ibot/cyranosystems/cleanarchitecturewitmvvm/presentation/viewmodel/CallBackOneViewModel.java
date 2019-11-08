package com.ibot.cyranosystems.cleanarchitecturewitmvvm.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry.CallBackOneRepositry;
import com.ibot.cyranosystems.cleanarchitecturewitmvvm.domain.CallBackOne;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class CallBackOneViewModel extends ViewModel {
    private CallBackOneRepositry callBackOneRepositry;
    public MutableLiveData<String> stringMutableLiveData;
    public CallBackOneViewModel() {
        callBackOneRepositry=new CallBackOneRepositry();
        callBackOneRepositry.getData("Call", new CallBackOne() {
            @Override
            public void success(MutableLiveData<String> data) {
                stringMutableLiveData=data;
            }
            @Override
            public void failed(MutableLiveData<String> error) {
                stringMutableLiveData=error;
            }
        });
    }
}
