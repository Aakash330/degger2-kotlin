package com.example.degger2_kotlin.module

import com.example.degger2_kotlin.Email_service
import com.example.degger2_kotlin.Message_Service
import com.example.degger2_kotlin.Notification_Service
import com.example.degger2_kotlin.qualifier.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    //this own Qualifier to avoid the conflict
    //getMessageService parameter changed
    @MessageQualifier
    @Provides
    fun getMessageService(retry:Int) :Notification_Service
    {
        /*here method is changed because it will take one argument as int type
        then we have to create NotificationServiceModule where u initializing the Dagger
        in my case i have to initialize the dagger in MainActivity
        */
        return Message_Service(retry)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: Email_service) :Notification_Service
    {
        return emailService
    }

}