package com.example.degger2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
   private lateinit var userRegistrationComponanet: UserRegistrationComponanet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //userRegistrationComponanet refernce
        userRegistrationComponanet=DaggerUserRegistrationComponanet.builder().build()

        userRegistrationComponanet.getUserRegitrationService()
            .registerUser("codingsick@gmail.com","1234567")

    }
}