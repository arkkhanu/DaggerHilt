package com.example.daggerhilt.Demo4Retrofit.Network

import com.example.daggerhilt.Demo4Retrofit.Model.Post
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getPost():List<Post>
}