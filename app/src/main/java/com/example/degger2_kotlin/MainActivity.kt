package com.example.degger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.degger2_kotlin.module.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
private lateinit var userRegistrationComponanet: UserRegistrationComponanet
@Inject lateinit var userRegistrationService:UserRegistrationService

@Inject lateinit var emailService: Email_service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //userRegistrationComponanet refernce


        //here is network module created and value is passed here
        userRegistrationComponanet=DaggerUserRegistrationComponanet.factory().create(7)
            //DaggerUserRegistrationComponanet.
        userRegistrationComponanet.injectTheField(this)
        userRegistrationService.registerUser("codingsick@gmail.com","112333")





    }
}