package by.zharikov.recipes.networking

import by.zharikov.recipes.dto.RecipeResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val VALUE = "search"
interface RecipeAPI {
    @GET(VALUE)
    fun getRecipeAsync(
        @Query("q")
        q:String,
        @Query("app_id")
        appid: String = "4b02c4dc",
        @Query("app_key")
        appKey:String = "df0f59a055f1a7c4fdd9aca2d8b4d852"
    ): Deferred<Response<RecipeResponse>>
}