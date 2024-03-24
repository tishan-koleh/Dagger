package com.example.dagger2demo

import android.provider.ContactsContract.CommonDataKinds.Email
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepositary: UserRepositary ,
                              private val notificationService: NotificationService) {

    fun registerUser(email: String,password:String){
        userRepositary.saveUser(email,password)
        notificationService.send(email,"xyz","abcd")
    }
}


       /* Unit Testing
        Single Responsiblity
        Lifetime of these objects
        Extensible*/