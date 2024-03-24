package com.example.dagger2demo

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to:String,from:String,body:String){
        Log.i("MYTAG","Enail sent")
    }
}