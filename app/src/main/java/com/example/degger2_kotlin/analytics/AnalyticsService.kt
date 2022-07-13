package com.example.degger2_kotlin.analytics

import android.util.Log
import com.example.degger2_kotlin.Constant

interface AnalyticsService {
    fun eventtrcting(evenName:String,eventType:String)
}
class MixPanel :AnalyticsService
{
    override fun eventtrcting(evenName: String, eventType: String) {
       Log.d(Constant.toCheck,"MixPanel tracking")
    }

}
class FirebaseAnalytics :AnalyticsService
{
    override fun eventtrcting(evenName: String, eventType: String) {
        Log.d(Constant.toCheck,"Firebase Analytics")

    }

}