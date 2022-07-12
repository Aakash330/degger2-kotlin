package com.example.degger2_kotlin.module

import com.example.degger2_kotlin.Firebase_Repository
import com.example.degger2_kotlin.Sql_Repository
import com.example.degger2_kotlin.User_Repository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

   /* @Provides
    fun getSqlRepository(sqlRepository: Sql_Repository): User_Repository
    {
        return sqlRepository
    }*/
    @Binds
    abstract fun getSqlRepsitory(sqlRepository: Sql_Repository):User_Repository
}