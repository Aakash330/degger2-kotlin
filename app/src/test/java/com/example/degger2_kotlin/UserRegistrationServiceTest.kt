package com.example.degger2_kotlin

import org.junit.Test


internal class UserRegistrationServiceTest
{
    @Test
    fun registerUserTest()
    {
        val userRegistrationService=DaggerUserRegistrationComponanet.builder().build().getUserRegitrationService()
        userRegistrationService.registerUser("mail@gmail","1235")


    }
}