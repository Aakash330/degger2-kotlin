package com.example.degger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
private lateinit var userRegistrationComponanet: UserRegistrationComponanet
@Inject lateinit var userRegistrationService:UserRegistrationService

@Inject lateinit var emailService: Email_service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //userRegistrationComponanet refernce
        userRegistrationComponanet=DaggerUserRegistrationComponanet.builder().build()
        userRegistrationComponanet.injectTheField(this)

        userRegistrationService.registerUser("codingsick@gamil.com","1234567")






    }
}