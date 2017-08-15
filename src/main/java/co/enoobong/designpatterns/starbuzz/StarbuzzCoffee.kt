package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object StarbuzzCoffee {

    @JvmStatic fun main(args: Array<String>) {
        val beverage = Espresso()
        println(beverage.description + " $" + beverage.cost())

        var beverage2: Beverage = DarkRoast()
        beverage2 = Mocha(beverage2)
        beverage2 = Mocha(beverage2)
        beverage2 = Whip(beverage2)
        println(beverage2.description + " $" + beverage2.cost())

        var beverage3: Beverage = HouseBlend()
        beverage3 = Soy(beverage3)
        beverage3 = Mocha(beverage3)
        beverage3 = Milk(beverage3)
        beverage3 = Whip(beverage3)
        println(beverage3.description + " $" + beverage3.cost())
    }
}