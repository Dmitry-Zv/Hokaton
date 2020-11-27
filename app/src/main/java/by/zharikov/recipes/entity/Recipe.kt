package by.zharikov.recipes.entity

data class Recipe(
    val label: String,
    val image: String,
    val url: String,
    val ingredientText: String,
    val weight: Double
)