package com.example.degger2_kotlin.module

import com.example.degger2_kotlin.Message_Service
import com.example.degger2_kotlin.Notification_Service
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService() :Notification_Service
    {
        return Message_Service()
    }

}