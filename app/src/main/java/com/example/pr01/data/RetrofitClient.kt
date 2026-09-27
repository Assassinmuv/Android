package com.example.pr01.data

import com.example.pr01.data.service.TodosInteface
import com.example.pr01.data.service.PostsInterface
import com.example.pr01.data.service.ProductInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val todosApi: TodosInteface = retrofit.create(TodosInteface::class.java)
    val postsApi: PostsInterface = retrofit.create(PostsInterface::class.java)
    val userApi: ProductInterface = retrofit.create(ProductInterface::class.java)
    val productApi: ProductInterface = retrofit.create(ProductInterface::class.java)

}