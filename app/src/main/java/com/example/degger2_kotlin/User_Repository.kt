package com.example.degger2_kotlin

import android.util.Log
import com.example.degger2_kotlin.analytics.AnalyticsService
import javax.inject.Inject
import javax.inject.Singleton


interface User_Repository{
    fun savePassword(email:String,password:String)

}
@Singleton
class Sql_Repository @Inject constructor(val analyticsService: AnalyticsService) :User_Repository{


   override fun savePassword(email:String,password:String) {
        Log.d(Constant.toCheck, "save in sqldb: ")
         analyticsService.eventtrcting("save user","create")

    }
}
class Firebase_Repository :User_Repository
{
    override fun savePassword(email: String, password: String) {
        Log.d(Constant.toCheck, "save in firebase: ")

    }

}