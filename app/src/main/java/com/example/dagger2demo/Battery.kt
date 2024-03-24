package com.example.dagger2demo

import android.util.Log

class Battery() {
    init {
        Log.i("MYTAG","Battery Constructed")
    }

    fun getPower(){
        Log.i("MYTAG","Batetry Power IS Available")
    }
}