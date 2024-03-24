package com.example.dagger2demo

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send(to:String,from:String,body:String)
}

class EmailService @Inject constructor():NotificationService {
    override fun send(to:String,from:String,body:String){
        Log.i("MYTAG","Enail sent")
    }
}

class MessageService:NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.i("MYTAG","Message sent")
    }
}