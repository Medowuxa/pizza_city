import kotlin.system.exitProcess

fun main() {
    val pizzaPeter = PizzaPeter(
        175.0, 241.5,
        167.5, 215.0
    )
    val pizzaMoscow = PizzaMoscow(
        215.0, 250.5,
        180.5, 240.0
    )
    val pizzaOmsk = PizzaOmsk(
        150.0, 260.5,
        170.5, 230.0
    )
    var currentPizzaCity: PizzaCity

    while (true) {
        println("Добрый день! Выберите город")
        println("1.Москва\n2.Санкт-Петербург\n3.Омск\n")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaOmsk
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }

        println("Выберите пиццу:")
        println("1.Неаполтанская пицца\n2.Римская пицца\n3.Сицилийская пицца\n4.Тирольская пицца\n\n0.Показать статистику")
        selectPizza(currentPizzaCity)

    }
}

private fun selectPizza(currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            currentPizzaCity.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            currentPizzaCity.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            currentPizzaCity.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            currentPizzaCity.tyroleanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

fun selectAddService(currentPizzaCity: PizzaCity) {
    if (currentPizzaCity is Drink) {
        currentPizzaCity.drinkSale() // Спрашивает о покупке кофе
    }
    if (currentPizzaCity is CheckPhoto) {
        currentPizzaCity.showCheckPhoto() // Спрашивает о показе чека
    }
    if (currentPizzaCity is Sauce) {
        currentPizzaCity.sauceSale()
    }
}