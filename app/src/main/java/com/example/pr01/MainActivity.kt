package com.example.pr01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr01.data.model.Post
import com.example.pr01.data.model.Product
import com.example.pr01.ui.viewModel.PostsViewModel
import com.example.pr01.ui.viewModel.ProductViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //PR01
            //region
//            val todoViewModel: TodoViewModel = viewModel()
//            todoViewModel.fetchTodos()
//endregion

            //PR02
            //region
//             val postViewModel: PostsViewModel = viewModel()
//             val post = Post(
//                title = "Уют в каждой детали: встречайте нашу новинку!",
//                body = "Мы знаем, как важно возвращаться туда, где тепло и спокойно. Наша новая коллекция ароматических свечей из соевого воска создана именно для таких моментов.",
//                tags = listOf(
//                    "декор дома",
//                    "уют в доме",
//                    "аромасвечи",
//                    "подарок девушке",
//                    "ручная работа",
//                    "новинка"
//               ),
//               views = 0
//            )
//            postViewModel.createPost(post)
            //endregion

            //PR03
            val productViewModel: ProductViewModel = viewModel()
            productViewModel.fetchProduct(25)

            val product = Product(
                title = "Офисное кресло Comfort-Т",
                price = 14200.00,
                category = "Офисная мебель",
                stock = 3
            )
            productViewModel.updateProduct(25, product)
             }
        }
    }