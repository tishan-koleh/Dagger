package com.example.dagger2demo

import android.util.Log

class SimCard(val serviceProvider : ServiceProvider) {
    init {
        Log.i("MYTAG","Sim card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}