class PizzaOmsk(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice

), CheckPhoto, Drink, Sauce {
    override fun showCheckPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            showCheckCount++
            println("Вам будет скдка 50 рублей")
        }
    }

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n 2. Нет")
        if (readln() == "1") {
            coffeeCount++
            when (lastSelectedPizza) {
                "neapolitan" -> coffeeWithNeapolitan++
                "roman" -> coffeeWithRoman++
                "sicilian" -> coffeeWithSicilian++
                "tyrolean" -> coffeeWithTyrolean++
            }
            println("С вас 200 рублей")
        }

    }

    override fun sauceSale() {
        println("Вам потребуется соус?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("1. Кетчуп\n2. Горчица")
            when (readln()) {
                "1" -> {
                    sauceKetchupCount++
                    println("С вас 30 рублей")
                }

                "2" -> {
                    sauceMustardCount++
                    println("С вас 35 рублей")
                }
            }

        }
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        lastSelectedPizza = "neapolitan"
        println("Спасибо за покупку неаполитанской пиццы в Омске")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        lastSelectedPizza = "roman"
        println("Спасибо за покупку римской пиццы в Омске")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        lastSelectedPizza = "sicilian"
        println("Спасибо за покупку сицилийской пиццы в Омске")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        lastSelectedPizza = "tyrolean"
        println("Спасибо за покупку тирольской пиццы в Омске")
    }


}