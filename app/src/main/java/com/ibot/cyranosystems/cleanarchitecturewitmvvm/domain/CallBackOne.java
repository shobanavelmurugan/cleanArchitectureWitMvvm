package com.ibot.cyranosystems.cleanarchitecturewitmvvm.domain;

import androidx.lifecycle.MutableLiveData;

/**
 * Created by innobot-linux-7 on 8/11/19,08,cleanArchitectureWitMvvm.
 */
public interface CallBackOne {
    void success(MutableLiveData<String> data);
    void failed(MutableLiveData<String> error);
}
