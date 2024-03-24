package com.example.dagger2demo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositaryModule {

//    @Provides
//    fun SQLRepositary(sqlRepositary: SQLRepositary):UserRepositary{
//        return sqlRepositary
//    }

    @Binds
    abstract fun getSqlRepositary(sqlRepositary: SQLRepositary):UserRepositary
}