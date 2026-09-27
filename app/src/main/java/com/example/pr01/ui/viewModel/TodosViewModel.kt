package com.example.pr01.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import kotlinx.coroutines.launch

class TodosViewModel: ViewModel() {
    fun fetchTodos(){
        viewModelScope.launch {
            try {
                val TodosResponse = RetrofitClient.todosApi.getAllTodos()
                val todos = TodosResponse.todos
                for (todo in todos){
                    Log.d("TodoViewModel", "Текст - ${todo.todo}  " + "Отметка о выполнении - ${todo.completed}  ")
                }
            }
            catch (e: Exception){
                Log.e("TodoViewModel", "${e.message}")
            }
        }
    }

}