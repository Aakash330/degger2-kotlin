package com.example.degger2_kotlin.module

import com.example.degger2_kotlin.Firebase_Repository
import com.example.degger2_kotlin.User_Repository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository(): User_Repository
    {
        return Firebase_Repository()
    }
}