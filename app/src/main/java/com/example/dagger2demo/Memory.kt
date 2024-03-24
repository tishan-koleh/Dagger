package com.example.dagger2demo

import android.util.Log

class Memory {
    init {
        Log.i("MYTAG","Memory constructed")
    }

    fun getSpaceAvailable(){
        Log.i("MYTAG","Space available")
    }
}