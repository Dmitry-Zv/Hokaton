package by.zharikov.recipes.mapper

import by.zharikov.recipes.dto.RecipeResponse
import by.zharikov.recipes.entity.Recipe

class RecipeMapper {
    fun convert(from: RecipeResponse.Hit?): Recipe {
        return Recipe(
            label = from?.recipe?.label.orEmpty(),
            image = from?.recipe?.image.orEmpty(),
            url = from?.recipe?.url.orEmpty(),
            ingredientText = from?.recipe?.ingredients?.get(0)?.text.orEmpty(),
            weight = from?.recipe?.ingredients?.get(0)?.weight ?: 0.0
        )
    }
}