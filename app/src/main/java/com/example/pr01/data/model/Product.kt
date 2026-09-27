package com.example.pr01.data.model

data class Product(
    val id: Int? = null,
    val title: String,
    val category: String,
    val price: Double,
    val stock: Int? = null
)
