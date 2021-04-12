package com.example.jetpacknavigationexample

import androidx.lifecycle.MutableLiveData

class SampleData {
    companion object{
        var defaultAmount = MutableLiveData<Long>(100L)
    }
}