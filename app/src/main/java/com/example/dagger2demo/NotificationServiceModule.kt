package com.example.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getNotificationService():NotificationService{
        return EmailService()
    }
}