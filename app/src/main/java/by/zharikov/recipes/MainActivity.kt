package by.zharikov.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.zharikov.recipes.mapper.RecipeMapper
import by.zharikov.recipes.retrofit.RetrofitFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val retrofit = RetrofitFactory.getRetrofit()
//        CoroutineScope(Dispatchers.IO).launch {
//            val response = retrofit.getRecipeAsync("chiken").await()
//            if (response.isSuccessful){
//                val recipe = response.body()?.hits?.map {
//                    RecipeMapper().convert(it)
//                }
//            }
//        }
    }

}