package com.example.pr01.data.service

import com.example.pr01.data.model.Post
import retrofit2.http.Body
import retrofit2.http.POST

interface PostsInterface {
    @POST("posts/add")
    suspend fun addPost(@Body post: Post): Post
}