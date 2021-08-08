package com.example.daggerhilt.Demo4Retrofit.di

import com.example.daggerhilt.Demo4Retrofit.ConstantFields
import com.example.daggerhilt.Demo4Retrofit.Network.PostApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @baseURL
    fun providesBaseURL():String = ConstantFields.baseURL

    @Provides
    @emptybaseURL
    fun providesEndBaseURL():String = ""

    @Provides
    @Singleton
    fun providesRetrofitBuilder(@baseURL baseUrl:String):Retrofit=
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun providesPostApiService(_retrofit: Retrofit):PostApiService =
        _retrofit.create(PostApiService::class.java)

}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class baseURL

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class emptybaseURL