package com.ibot.cyranosystems.cleanarchitecturewitmvvm.data.repositry;

import androidx.lifecycle.MutableLiveData;

import com.ibot.cyranosystems.cleanarchitecturewitmvvm.domain.CallBackOne;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public class CallBackOneRepositry {
    private MutableLiveData<String> stringMutableLiveData=new MutableLiveData<>();
    public CallBackOneRepositry(){

    }
    public void getData(final String name, final CallBackOne callBackOne){
        if(name.equals("Call")){
            stringMutableLiveData.setValue("This is the Callback");
            callBackOne.success(stringMutableLiveData);
        }else{
            stringMutableLiveData.setValue("error");
            callBackOne.failed(stringMutableLiveData);
        }
    }
}
