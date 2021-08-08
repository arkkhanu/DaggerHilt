package com.example.daggerhilt.Demo2

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

/*@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun binding(imp: OneImp):One
}*/



@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @FName
    fun getMyFName(): String = "Abdul"

    @Provides
    @LName
    fun getMyLName(): String = "Rehman"

    @Provides
    @Singleton
    fun binding(): One = OneImp()
//    fun binding(): One = OneImp(getMyFName(),getMyFName())
//    fun binding(fname:String,lName: String): One = OneImp(fname,lName)
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName
