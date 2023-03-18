package com.example.new_coronavirus.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    //private MutableLiveData<String> mText;

    private MutableLiveData<String> mUrl;

    public DashboardViewModel() {
        //mText = new MutableLiveData<>();
        //mText.setValue("This is dashboard fragment");
        mUrl = new MutableLiveData<>();
        //mUrl.setValue("https://www.baidu.com");
        mUrl.setValue("http://118.178.140.146:9090/YQ/index.html");
    }

    //public LiveData<String> getText() {
    //    return mText;
    //}
    public LiveData<String> getUrl() {return mUrl; }
}