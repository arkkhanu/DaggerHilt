package com.example.daggerhilt.Demo4Retrofit.Network

import com.example.daggerhilt.Demo4Retrofit.Model.Post
import javax.inject.Inject

class PostServiceImp @Inject constructor(private val postApiService: PostApiService) {
    suspend fun getPost():List<Post> = postApiService.getPost()
}