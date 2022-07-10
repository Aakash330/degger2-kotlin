package com.example.degger2_kotlin

class UserRegistrationService {
    private val userRepository=User_Repository()
    private val emailService=Email_service()

    fun registerUser(email:String,password:String)
    {
        userRepository.savePassword(email,password)
        emailService.send(email,"noreplyCodingsick@gmail.com",password)
    }


}