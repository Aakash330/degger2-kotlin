package com.example.degger2_kotlin

import android.util.Log
import javax.inject.Inject


class Email_service @Inject constructor()  {
    private  val TAG = "Email_service"

    fun send(to:String,from:String,body:String)
    {
        Log.d(Constant.toCheck, " email sent: ")
    }
}
