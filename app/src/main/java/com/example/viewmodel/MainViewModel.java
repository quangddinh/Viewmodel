package com.example.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> dataString = new MutableLiveData<>();

    public  LiveData<String> getDataString() {
        return dataString;
    }

    public void setDataString (String text){
        dataString.setValue(text);
    }
}
