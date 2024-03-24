package com.example.dagger2demo

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistration():UserRegistrationService

    fun getEmailService(): EmailService
}