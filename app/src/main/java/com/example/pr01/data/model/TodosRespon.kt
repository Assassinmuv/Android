package com.example.pr01.data.model

data class TodosRespon(
    val todos: List<Todos>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
