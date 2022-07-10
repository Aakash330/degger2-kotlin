package com.example.degger2_kotlin

import android.util.Log
import javax.inject.Inject

class User_Repository @Inject constructor(){

    private  val TAG = "User_Repository"


    fun savePassword(email:String,password:String) {
        Log.d(Constant.toCheck, "save in db: ")

    }
}