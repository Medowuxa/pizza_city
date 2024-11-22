abstract class PizzaCity(
    private val neapolitanPizzaPrice: Double, private val romanPizzaPrice: Double,
    private val sicilianPizzaPrice: Double, private val tyroleanPizzaPrice: Double
) {
    protected var neapolitanPizzaCount = 0
    protected var romanPizzaCount = 0
    protected var sicilianPizzaCount = 0
    protected var tyroleanPizzaCount = 0
    protected var coffeeCount = 0
    protected var showCheckCount = 0
    protected var coffeeWithNeapolitan = 0
    protected var coffeeWithRoman = 0
    protected var coffeeWithSicilian = 0
    protected var coffeeWithTyrolean = 0
    protected var lastSelectedPizza: String = ""
    protected var sauceKetchupCount = 0
    protected var sauceMustardCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyroleanPizzaSale()


    fun showStatistics() {
        println("Продано сицилйской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")

        var money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice

        val coming = neapolitanPizzaCount + romanPizzaCount + sicilianPizzaCount + tyroleanPizzaCount

        if (this is Drink) {
            println("Продано кофе: $coffeeCount")
            val coffeeCost = coffeeCount * 200
            println("Выручка с кофе: $coffeeCost")
            money += coffeeCost
            val coffeeProcent = coffeeCount * 100 / coming
            println("Кофе взяло $coffeeProcent% посетителей")
            val coffeeWithNeapolitanPercent = if (coffeeCount > 0) coffeeWithNeapolitan * 100 / coffeeCount else 0
            val coffeeWithRomanPercent = if (coffeeCount > 0) coffeeWithRoman * 100 / coffeeCount else 0
            val coffeeWithSicilianPercent = if (coffeeCount > 0) coffeeWithSicilian * 100 / coffeeCount else 0
            val coffeeWithTyroleanPercent = if (coffeeCount > 0) coffeeWithTyrolean * 100 / coffeeCount else 0
            println("Кофе с неаполитанской пиццей взяли $coffeeWithNeapolitan это $coffeeWithNeapolitanPercent%")
            println("Кофе с римской пиццей взяли $coffeeWithRoman это $coffeeWithRomanPercent%")
            println("Кофе с сицилийской пиццей взяли $coffeeWithSicilian это $coffeeWithSicilianPercent%")
            println("Кофе с тирольской пиццей взяли $coffeeWithTyrolean это $coffeeWithTyroleanPercent%")
        }

        if (this is CheckPhoto) {
            println("Показано чеков: $showCheckCount")
            val showCheckCost = showCheckCount * 50
            println("Сумма скидки: $showCheckCost")
            money -= showCheckCost
            val showCheckProcent = coffeeCount * 100 / coming
            println("Чек показали $showCheckProcent% посетителей")
        }

        if (this is Sauce) {
            println("Продано кетчупа: $sauceKetchupCount")
            val sauceKetchupCost = sauceKetchupCount * 30
            println("Заработано с кетчупа: $sauceKetchupCost")
            println("Продано горчицы: $sauceMustardCount")
            val sauceMustardCost = sauceMustardCount * 35
            println("Заработано с горчицы: $sauceMustardCost")
            money += sauceKetchupCost + sauceMustardCost
        }

        println("Всего заработано денег: $money")

    }


}