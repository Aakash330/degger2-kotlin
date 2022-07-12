package com.example.degger2_kotlin.module

import com.example.degger2_kotlin.Email_service
import com.example.degger2_kotlin.Message_Service
import com.example.degger2_kotlin.Notification_Service
import com.example.degger2_kotlin.qualifier.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    //this own Qualifier to avoid the conflict
    @MessageQualifier
    @Provides
    fun getMessageService() :Notification_Service
    {
        return Message_Service()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: Email_service) :Notification_Service
    {
        return emailService
    }

}