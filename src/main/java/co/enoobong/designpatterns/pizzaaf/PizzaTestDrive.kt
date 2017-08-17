package co.enoobong.designpatterns.pizzaaf


/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
object PizzaTestDrive {

    @JvmStatic
    fun main(args: Array<String>) {
        val nyStore = NYPizzaStore()
        val chicagoStore = ChicagoPizzaStore()

        nyStore.apply {
            var pizza = orderPizza("cheese")
            println("Ethan ordered a " + pizza + "\n")

            pizza = orderPizza("clam")
            println("Ethan ordered a " + pizza + "\n")

            pizza = orderPizza("pepperoni")
            println("Ethan ordered a " + pizza + "\n")

            pizza = orderPizza("veggie")
            println("Ethan ordered a " + pizza + "\n")
        }

        chicagoStore.apply {
            var pizza = orderPizza("cheese")
            println("Joel ordered a " + pizza + "\n")

            pizza = chicagoStore.orderPizza("clam")
            println("Joel ordered a " + pizza + "\n")

            pizza = chicagoStore.orderPizza("pepperoni")
            println("Joel ordered a " + pizza + "\n")

        }
    }
}
