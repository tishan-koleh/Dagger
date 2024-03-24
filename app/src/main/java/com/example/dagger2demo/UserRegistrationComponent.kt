package com.example.dagger2demo

import dagger.Component

@Component(modules = [UserRepositaryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

//    fun getUserRegistration():UserRegistrationService
//
//    fun getEmailService(): EmailService
    fun inject(mainActivity: MainActivity)
}