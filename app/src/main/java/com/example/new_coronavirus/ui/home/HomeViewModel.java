package com.example.new_coronavirus.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private String mText;

    public HomeViewModel(String content) {
        this.mText = content;
    }

    public String getText() {
        return mText;
    }
}