package com.example.degger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.degger2_kotlin.application.userAplication
import com.example.degger2_kotlin.module.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
private lateinit var userRegistrationComponanet: UserRegistrationComponanet
@Inject lateinit var userRegistrationService:UserRegistrationService

@Inject lateinit var emailService: Email_service
@Inject lateinit var emailService2: Email_service  //both email service singleton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRegistrationComponanet=(application as userAplication).userRegistrationComponanet
            //DaggerUserRegistrationComponanet.
        userRegistrationComponanet.injectTheField(this)
        userRegistrationService.registerUser("codingsick@gmail.com","112333")





    }
}