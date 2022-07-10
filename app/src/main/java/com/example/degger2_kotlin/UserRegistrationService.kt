package com.example.degger2_kotlin

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val emailService: Email_service,
                                                      private val userRepository: User_Repository
)
{

    fun registerUser(email:String,password:String)
    {
        userRepository.savePassword(email,password)
        emailService.send(email,"noreplyCodingsick@gmail.com",password)
    }

}