package com.example.viewmodelsavedstate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private SavedStateHandle handle;

    public MyViewModel(SavedStateHandle handle) {
        if(!handle.contains("Number")){     //判断handle是否有值，初始化为0
            handle.set("Number",0);
        }
        this.handle = handle;
    }

    public LiveData<Integer>getNumber(){
        return handle.getLiveData("Number");
    }
    public void add(){
        handle.set("Number",(int) handle.get("Number")+1);
    }
    //强制类型转换，转换int型执行

}
