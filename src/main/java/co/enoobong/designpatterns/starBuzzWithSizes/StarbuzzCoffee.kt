package co.enoobong.designpatterns.starBuzzWithSizes




/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
object StarbuzzCoffee {

    @JvmStatic
    fun main(args: Array<String>){

        var beverage3: Beverage = HouseBlend()
        beverage3.size = Beverage.Size.VENTI
        beverage3 = Soy(beverage3)
        beverage3 = Mocha(beverage3)
        beverage3 = Whip(beverage3)
        println(beverage3.description
                + " $" + String.format("%.2f", beverage3.cost()))
    }
}