package com.example.dagger2demo

import android.util.Log

class Smartfone(val battery : Battery,val simCard : SimCard,val memory:Memory) {

    init {
        battery.getPower()
        simCard.getConnection()
        memory.getSpaceAvailable()
        Log.i("MYTAG","Smartfone constructed")
    }

    fun makeCall(){
        Log.i("MYTAG","Calling.....")
    }
}