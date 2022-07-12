package com.example.degger2_kotlin

import android.util.Log
import javax.inject.Inject

interface Notification_Service
{
    fun send(to:String,from:String,body:String)
}
class Email_service @Inject constructor() :Notification_Service {
    private  val TAG = "Email_service"
   override fun send(to:String,from:String,body:String)
    {
        Log.d(Constant.toCheck, " email sent: ")
    }
}
class Message_Service(private val retrycount:Int) :Notification_Service
{
    override fun send(to: String, from: String, body: String) {
        Log.d(Constant.toCheck,"Message service")
    }

}