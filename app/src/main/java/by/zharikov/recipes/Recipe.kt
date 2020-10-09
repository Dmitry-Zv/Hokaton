package by.zharikov.recipes

data class Recipe(
    val name:String,
    val mainIngredient: String,
    val urlPicture: String,
    val recipeDish: String)
object RecipeSet{
    fun getRecipe() = listOf<Recipe>(
        Recipe(name = "Драники", mainIngredient = "Картофель", urlPicture = "https://gotovim-doma.ru/images/recipe/e/4c/e4cad715fa2c3406c8bce678272beed8_l.jpg", recipeDish =
        " Ингридиенты:\n"+
                "Картофель крупный - 7 шт.\n" +
                "Лук (по желанию) - 1 шт.\n" +
                "Яйца (по желанию) - 1-2 шт.\n" +
                "Мука (по желанию)\n" +
                "Соль - по вкусу \n" +
                "1. Картофель необходимо в сыром виде очистить от кожуры, тщательно вымыть и натереть на мелкой терке. Для измельчения картофеля можно также воспользоваться блендером или перекрутить его через мясорубку. Аналогично нужно измельчить репчатый лук и добавить его к картофелю. В луково-картофельную смесь для связки добавляется сырое яйцо, а также специи по вкусу (в основном, черный молотый перец и соль) и мука. Тесто для драников тщательно замешивается до однородности.\n" +
                "2. Сковорода с раскаленным маслом уже ожидает драников, поэтому с этого момента начинается сам процесс жарки. Тесто для драников нужно аккуратно, при помощи столовой ложки, выкладывать на сковородку в виде блинчиков. Размер драников зависит от предпочтений хозяйки. Они могут быть большими, тогда их в дальнейшем можно будет скрутить с разнообразной начинкой, трансформируя обыкновенные драники в фаршированную вкуснотищу. Драники могут быть и совсем маленькими, тогда их будет удобно подавать на небольших тарелках, к тому же, они наверняка понравятся малышам.\n"+
        "3. 3. Обжариваются драники на среднем огне с двух сторон до появления красивой румяной корочки, после чего сковородка накрывается крышкой, а блинчики прожариваются еще приблизительно три минуты на маленьком огне."
        ),
        Recipe(name = "Куриные котлеты", mainIngredient = "Курица", urlPicture = "https://gotovim-doma.ru/images/recipe/0/92/0926a0429514ba6c953618596004e0bb_l.jpg", recipeDish =
        " Ингридиенты: \n" +
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
        "7. Мокрыми руками сформировать котлеты.\n"+
        "8. Разогреть сковороду. Налить растительное масло (уровень масла в сковороде по высоте должен быть примерно 0,5 см). В горячее масло выложить котлеты.\n"+
        "9. Жарить куриные котлеты на небольшом огне до подрумянивания (около 5 минут) на одной стороне, затем перевернуть и так же жарить куриные котлеты с другой стороны. Так пожарить все котлеты.\n"+
        "10. Классические куриные котлеты готовы. Подавать с любимым гарниром или овощами."),
        Recipe(name = "Шарлотка", mainIngredient = "Яблоки", urlPicture = "https://www.maggi.ru/data/images/recept/img640x500/recept_3842_pyah.jpg", recipeDish =
            "Ингридиенты\n"+
                    "Яблоки (желательно кислые) - 500-600 г\n" +
                    "Сахар - 160 г\n" +
                    "Мука пшеничная - 160 г\n" +
                    "Яйца - 4 больших или 5 маленьких\n" +
                    "Соль - 1 щепотка\n" +
        "1. Подготовить продукты для яблочной шарлотки. Так как сахара мы берем достаточно много и тесто получится сладким, то яблоки лучше брать кислых сортов.\n" +
        "2. Взбить яйца с сахаром и щепоткой соли в светлую густую массу.\n" +
                    "3.Чтобы убедиться, что масса уже хорошо взбилась, проведите линию венчиком. Если она остаётся видимой в течение 1-2 секунд, а потом растекается, то яйца с сахаром уже хорошо взбиты. Если же она сразу растекается, то нужно взбивать еще.\n" +
        "4. Подготовить яблоки, вырезать из них середину, нарезать слайсами (или кубиками).\n"+
        "5. Муку частями просеивать в яично-сахарную смесь и аккуратно перемешивать лопаткой движениями снизу вверх.\n" +
                    "С бисквитным тестом нужно работать осторожно, чтобы сохранить по максимуму его воздушность.\n" +
                    "(Также на этом этапе можно добавить в тесто 1 ст. ложку жирной сметаны или 1 ст. ложку растопленного сливочного масла - таким образом, пирог будет влажнее.)\n" +
                    "6.Форму (диаметр - 22 см) выстелить пергаментом или смазать сливочным маслом, припылить мукой. Вылить 1/2 часть теста, разровнять.\n" +
        "7. Половину яблок, нарезанных дольками, выложить на тесто. Начинаем выкладывать дольки от бортиков и двигаемся по спирали прямо к середине.\n" +
        "8. Сверху залить оставшимся тестом и таким же образом выложить оставшиеся яблоки. Также на этом этапе вы можете присыпать пирог корицей, если любите, конечно.\n" +
        "9. Если нарезать яблоки кубиками, то можно их добавить в тесто, аккуратно перемешать и потом выложить всю массу в форму для выпекания.\n" +
        "10. Выпекать яблочную шарлотку в течение 20-30 минут при температуре 180 градусов. Готовность можно проверить деревянной шпажкой.\n" +
        "11. Шарлотка с яблоками готова. Приятного аппетита!."),
        Recipe(name = "Жаренная картошка", mainIngredient = "Картофель", urlPicture = "https://smachno.ua/wp-content/uploads/2018/07/17/maxresdefault1.jpg",
        recipeDish =
        "Ингридиенты \n"+
        "Картофель - 500 г\n" +
                "Лук репчатый, небольшой - 1 шт.\n" +
                "Соль - по вкусу\n" +
                "Перец - по вкусу\n" +
                "Масло растительное - для жарки\n"+
        "1. Подготавливаем ингредиенты. Картофель и лук очищаем.\n" +
        "2. Картофель нарезаем соломкой. Измельчаем лук.\n" +
        "3. В сковороду с раскаленным маслом выкладываем картофель. Ставим средний огонь. Обжариваем картошку почти до готовности. Крышкой не закрываем, периодически (не часто) перемешиваем. \n" +
        "4. Когда картошка будет почти готова, солим и перчим по вкусу, перемешиваем. Добавляем лук, перемешиваем и готовим еще минут 5-7, так же периодически перемешивая. \n" +
        "5. Жареная картошка с луком готова.\n" +
                "Приятного аппетита!"),
        Recipe(name = "Варенный картофель", mainIngredient = "Картофель", urlPicture = "https://img.povar.ru/main/eb/bb/c3/f9/varenaya_kartoshka-385961.jpg",
        recipeDish = "Ингридиенты \n" +
                "картофель – 5-7 штук (500 грамм);\n" +
                "сливочное масло – 30-40 грамм;\n" +
                "укроп – 1 средний пучок;\n" +
                "чеснок – 2 зубчика;\n" +
                "соль – по вкусу."+
                "1. Картофель почистить, большие клубни разрезать на 2 или 4 части, мелкие и средние можно варить целиком.\n" +
                "2. Сложить картошку в кастрюлю, залить холодной водой, довести до кипения.\n" +
                "3. Убавить мощность плитки, варить 15-20 минут на среднем огне снимая белую пену. Чем мельче картофельные кусочки, тем быстрее они будут готовы.\n" +
                "4. Слить воду, поставить кастрюлю обратно на выключенную плиту, посолить, добавить сливочное масло.\n" +
                "5. Укроп помыть, просушить, нарезать (можно использовать замороженный или сушеный). Добавить в кастрюлю.\n" +
                "6. Выдавить в картофель два зубчика чеснока.\n" +
                "7. Накрыть кастрюлю крышкой и несколько раз встряхнуть на себя, чтобы масло, укроп и чеснок равномерно распределились по кусочкам.\n" +
                "8. Выложить картофель с укропом на тарелку и подать к столу горячим."
        ),
        Recipe(name = "Курица в духовке", mainIngredient = "Курица", urlPicture = "https://foodman.club/wp-content/uploads/2017/10/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA-%D0%BA%D1%83%D1%80%D0%B8%D1%86%D0%B0.png", recipeDish = "" +
                "1. Промыть и обсушить курицу бумажными полотенцами.\n"+
        "2. Приготовить маринад: чеснок пропустить через пресс и смешать с базиликом, паприкой, солью и перцем, залить оливковым маслом и перемешать. 2 ч.л. маринада использовать для натирания курицы изнутри.\n"+
        "3. В форму для запекания, смазанную растительным маслом, вниз грудкой выложить курицу, смазать маринадом и перевернуть вверх грудкой, сверху тоже натереть маринадом. Дать курице 1 час промариноваться.\n"+
        "4. Затем поставить курицу в разогретую до 180 градусов духовку и запекать 60-90 минут до готовности и золотистой корочки. Для большей сочности курочку во время приготовления лучше периодически поливать выделяющимся соком."),
        Recipe(name = "Яблочный сок", mainIngredient = "Яблоки", urlPicture = "https://img.povar.ru/main/fb/92/55/c9/yablochnii_sok_na_zimu-63713.jpg",recipeDish =
        "1. Подготовьте яблоки для сока натурального яблочного.\n"+
        "2. Банки тщательно промойте, простерилизуйте любым способом.\n" +
        "3. Яблоки вымойте, очистите от червоточин и повреждений, снимите кожицу и выньте серединки.\n" +
        "4. Очищенные таким образом яблоки пропустите через мясорубку или соковыжималку.\n" +
        "5. Если пропускали яблоки через мясорубку, то яблочную массу частями выложите на плотную х/б ткань (или сложенную в несколько слоев марлю).\n" +
        "6. Вручную отожмите сок. Полученный натуральный яблочный сок нагрейте, помешивая, до температуры 90-95 градусов (до появления мелких пузырьков по периметру поверхности сока), но не кипятите сок. Снимите образовавшуюся пену.\n" +
        "7. Разлейте пастеризованный яблочный сок в теплые стерилизованные банки и закройте (закатайте) стерилизованными металлическими крышками.\n" +
        "8. Натуральный яблочный сок готов. Приятного аппетита!")
    )
}