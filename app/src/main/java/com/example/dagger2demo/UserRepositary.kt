package com.example.dagger2demo

import android.util.Log
import javax.inject.Inject

interface UserRepositary{
    fun saveUser(email:String,password:String)
}

class SQLRepositary @Inject constructor():UserRepositary{
    override fun saveUser(email:String,password:String){
        Log.i("MYTAG","User saved in db")
    }
}

class FirebaseRepositary:UserRepositary{
    override fun saveUser(email: String, password: String) {
        Log.i("MYTAG","User saved in Firebase")
    }
}