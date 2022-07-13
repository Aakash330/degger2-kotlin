package com.example.degger2_kotlin.analytics

import dagger.Module
import dagger.Provides

@Module
class AnalyticModule {

    @Provides
    fun getAnalyticService() :AnalyticsService
    {
        return MixPanel()
    }
}