package com.example.degger2_kotlin

import android.util.Log
import javax.inject.Inject


interface User_Repository{
    fun savePassword(email:String,password:String)

}

class Sql_Repository @Inject constructor() :User_Repository{


   override fun savePassword(email:String,password:String) {
        Log.d(Constant.toCheck, "save in sqldb: ")

    }
}
class Firebase_Repository :User_Repository
{
    override fun savePassword(email: String, password: String) {
        Log.d(Constant.toCheck, "save in firebase: ")

    }

}