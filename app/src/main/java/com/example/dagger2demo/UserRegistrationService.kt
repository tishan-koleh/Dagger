package com.example.dagger2demo

import android.provider.ContactsContract.CommonDataKinds.Email
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepositary: UserRepositary ,
                              private val emailService: EmailService) {

    fun registerUser(email: String,password:String){
        userRepositary.saveUser(email,password)
        emailService.send(email,"xyz","abcd")
    }
}


       /* Unit Testing
        Single Responsiblity
        Lifetime of these objects
        Extensible*/