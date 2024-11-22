class PizzaPeter(
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice

), Drink {
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

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        lastSelectedPizza = "neapolitan"
        println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        lastSelectedPizza = "roman"
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        lastSelectedPizza = "sicilian"
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        lastSelectedPizza = "tyrolean"
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }
}

