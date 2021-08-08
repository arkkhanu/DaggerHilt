package com.example.daggerhilt.Demo4Retrofit.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.daggerhilt.Demo4Retrofit.Model.Post
import com.example.daggerhilt.Demo4Retrofit.Repository.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject


@HiltViewModel
class PostViewModel
    @Inject
    constructor(private val postRepository: PostRepository) : ViewModel() {

        val response :LiveData<List<Post>> =postRepository.getPost()
            .catch {e->
                Log.d("ARK", ": ${e.localizedMessage}")
            }
            .asLiveData()

}