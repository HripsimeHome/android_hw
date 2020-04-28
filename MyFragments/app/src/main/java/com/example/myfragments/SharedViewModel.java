package com.example.myfragments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> name = new MutableLiveData<>();

    public void setName(String nameStr) {
        name.setValue(nameStr);
    }

    public LiveData<String> getName() {
        return name;
    }
}

