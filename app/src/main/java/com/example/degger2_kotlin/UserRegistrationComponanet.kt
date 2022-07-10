package com.example.degger2_kotlin

import dagger.Component

@Component
interface UserRegistrationComponanet {
    fun getUserRegitrationService():UserRegistrationService
}