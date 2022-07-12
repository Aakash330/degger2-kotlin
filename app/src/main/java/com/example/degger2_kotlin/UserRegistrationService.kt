package com.example.degger2_kotlin

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @Named("message")  private val notificationService: Notification_Service,
   private val userRepository: User_Repository
)
{

    fun registerUser(email:String,password:String)
    {
        userRepository.savePassword(email,password)
        notificationService.send(email,"noreplyCodingsick@gmail.com",password)
    }

}