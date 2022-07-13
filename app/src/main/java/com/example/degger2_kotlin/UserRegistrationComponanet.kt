package com.example.degger2_kotlin

import com.example.degger2_kotlin.module.NotificationServiceModule
import com.example.degger2_kotlin.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponanet {

    fun injectTheField(mainActivity: MainActivity)

    //create the one factory method using
    @Component.Factory
    interface Factory
    {
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponanet
    }



}