package com.example.degger2_kotlin.application

import android.app.Application
import com.example.degger2_kotlin.DaggerUserRegistrationComponanet
import com.example.degger2_kotlin.UserRegistrationComponanet

class userAplication :Application() {
    lateinit var userRegistrationComponanet: UserRegistrationComponanet

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponanet=DaggerUserRegistrationComponanet.factory().create(5)
    }
}