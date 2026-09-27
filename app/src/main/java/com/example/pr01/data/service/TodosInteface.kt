package com.example.pr01.data.service

import com.example.pr01.data.model.TodosRespon
import retrofit2.http.GET

interface TodosInteface {
    @GET("todos")
    suspend fun getAllTodos(): TodosRespon
}