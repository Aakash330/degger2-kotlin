package com.example.degger2_kotlin

import com.example.degger2_kotlin.module.NotificationServiceModule
import com.example.degger2_kotlin.module.UserRepositoryModule
import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponanet {

    fun injectTheField(mainActivity: MainActivity)



}