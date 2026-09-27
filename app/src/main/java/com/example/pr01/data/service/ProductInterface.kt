package com.example.pr01.data.service

import com.example.pr01.data.model.Product
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductInterface {
    @GET("products/{id}")
    suspend fun  getOneProduct(@Path("id")productId: Int): Product

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id")productId: Int,@Body product: Product): Product
}