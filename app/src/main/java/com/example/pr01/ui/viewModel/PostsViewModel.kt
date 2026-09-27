package com.example.pr01.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.model.Post
import com.example.pr01.data.RetrofitClient
import kotlinx.coroutines.launch

class PostsViewModel: ViewModel() {
    fun createPost(post: Post){
        viewModelScope.launch {
            try {
                val addedPost = RetrofitClient.postsApi.addPost(post)
                Log.d("createPost",
                    "Название  -> ${addedPost.title}\n"+
                            "Текст  -> ${addedPost.body}\n+" +
                            "Тэги  -> ${addedPost.tags}\n" +
                            "Количество просмотров -> ${addedPost.views}")
            }
            catch (e: Exception){
                Log.e("PostsViewModel", "${e.message}")
            }
        }
    }
}