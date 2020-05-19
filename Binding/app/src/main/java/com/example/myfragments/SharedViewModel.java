package com.example.myfragments;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class SharedViewModel extends ViewModel {
    //public MutableLiveData<String> name = new MutableLiveData<>();
    public final MutableLiveData<String> number = new MutableLiveData<>();
    public final MutableLiveData<String> result = new MutableLiveData<>();
    //My Function for Biinding
    private float checker()
    {
        float num = 0.0f;

        if (number.getValue() != null && !number.getValue().isEmpty()) {
            try {
                num = Float.parseFloat(number.getValue().toString());
            } catch (NumberFormatException nfe) {
                System.out.println("Could not parse" + nfe);
            }
        }
        return num;
    }

    public void switched_button_plus() {
        float num = checker();
        num = num + 2;
        String number = Float.toString(num);
        result.setValue(number);
        Log.d("viewmodel", "button pressed");
    }
    public void switched_button_multiply() {
        float num = checker();
        num = num * 2;
        String number = Float.toString(num);
        result.setValue(number);
        Log.d("viewmodel", "button pressed");
    }
    public void switched_button_divide() {
        float num = checker();
        num = num / 2;
        String numberStr = Float.toString(num);
        result.setValue(numberStr);
        Log.d("viewmodel", "button pressed");
    }
}

