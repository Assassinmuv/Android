package com.example.pr01.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.Product
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {

    fun fetchProduct(productId: Int){
        viewModelScope.launch {
            try {
                val getProduct = RetrofitClient.productApi.getOneProduct(productId)
                Log.d("ProductViewModel: updateProduct",
                    "Идентификатор ${getProduct.id}\n" +
                            "Название ${getProduct.title}\n" +
                            "Цена ${getProduct.price}\n" +
                            "Категория ${getProduct.category}\n" +
                            "Количество на складе ${getProduct.stock}")
            } catch (ex: Exception){
                Log.e("UserViewModel: fetchProduct",ex.message.toString())
            }
        }
    }

    fun updateProduct(productId: Int, product: Product){
        viewModelScope.launch {
            try {
                val response = RetrofitClient.productApi.updateProduct(productId,product)
                Log.d("ProductViewModel: updateProduct",
                    "Идентификатор ${response.id}\n" +
                            "Название ${response.title}\n" +
                            "Цена ${response.price}\n" +
                            "Категория ${response.category}\n" +
                            "Количество на складе ${response.stock}")
            } catch (ex: Exception){
                Log.e("UserViewModel: updateProduct",ex.message.toString())
            }
        }
    }
}



