package com.example.dagger2demo

import android.util.Log
import javax.inject.Inject

class UserRepositary @Inject constructor(){
    fun saveUser(email:String,password:String){
        Log.i("MYTAG","User saved in db")
    }
}