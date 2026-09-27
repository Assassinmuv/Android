package com.example.pr01.data.model

data class Post(
    val id: Int? = null,
    val title: String,
    val body: String,
    val tags: List<String>,
    val views: Int
)
