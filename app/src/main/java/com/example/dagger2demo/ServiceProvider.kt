package com.example.dagger2demo

import android.util.Log

class ServiceProvider {

    init {
        Log.i("MYTAG","ServiceProvider Constructed")
    }

    fun getServiceProvider(){
        Log.i("MYTAG","Service Provider Connected")
    }
}