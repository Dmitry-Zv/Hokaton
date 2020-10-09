package by.zharikov.recipes

data class Recipe(
    val name:String,
    val mainIngredient: String,
    val urlPicture: String,
    val recipeDish: String)
object recipeSet{
    fun getRecipe() = listOf<Recipe>(
        Recipe(name = "Драники", mainIngredient = "Картофель", urlPicture = "https://gotovim-doma.ru/images/recipe/e/4c/e4cad715fa2c3406c8bce678272beed8_l.jpg", recipeDish =
        "1. Картофель необходимо в сыром виде очистить от кожуры, тщательно вымыть и натереть на мелкой терке. Для измельчения картофеля можно также воспользоваться блендером или перекрутить его через мясорубку. Аналогично нужно измельчить репчатый лук и добавить его к картофелю. В луково-картофельную смесь для связки добавляется сырое яйцо, а также специи по вкусу (в основном, черный молотый перец и соль) и мука. Тесто для драников тщательно замешивается до однородности.\n" +
                "2. Сковорода с раскаленным маслом уже ожидает драников, поэтому с этого момента начинается сам процесс жарки. Тесто для драников нужно аккуратно, при помощи столовой ложки, выкладывать на сковородку в виде блинчиков. Размер драников зависит от предпочтений хозяйки. Они могут быть большими, тогда их в дальнейшем можно будет скрутить с разнообразной начинкой, трансформируя обыкновенные драники в фаршированную вкуснотищу. Драники могут быть и совсем маленькими, тогда их будет удобно подавать на небольших тарелках, к тому же, они наверняка понравятся малышам.\n"+
        "3. 3. Обжариваются драники на среднем огне с двух сторон до появления красивой румяной корочки, после чего сковородка накрывается крышкой, а блинчики прожариваются еще приблизительно три минуты на маленьком огне."
        ),
        Recipe(name = "Куриные котлеты", mainIngredient = "Курица", urlPicture = "https://gotovim-doma.ru/images/recipe/0/92/0926a0429514ba6c953618596004e0bb_l.jpg", recipeDish =
        "Куриное филе - 500 г\n" +
                "или куриный фарш - 500 г\n" +
                "Лук репчатый - 1 шт.\n" +
                "Чеснок - 2-3 зубчика\n" +
                "Хлеб белый - 150 г\n" +
                "Молоко - 50 г\n" +
                "Соль - по вкусу\n" +
                "Перец - по вкусу\n" +
                "Яйцо куриное (по желанию) - 1 шт.\n" +
                "Растительное масло - сколько уйдет\n"+
                "1. У хлеба срезать корочку, замочить в молоке.\n"+
        "2. Очистить лук и чеснок. Лук помыть и разрезать на 4 части.\n"+
        "3. Куриное филе вымыть, разрезать на кусочки.\n"+
        "4. Через мясорубку пропустить куриное филе, лук, чеснок и хлеб.\n"+
        "5. Посолить и поперчить фарш. По желанию добавить куриное яйцо.\n"+
        "6. Хорошо перемешать фарш.\n"+
        "7.Мокрыми руками сформировать котлеты.\n"+
        "8.Разогреть сковороду. Налить растительное масло (уровень масла в сковороде по высоте должен быть примерно 0,5 см). В горячее масло выложить котлеты.\n"+
        "9.")
    )
}