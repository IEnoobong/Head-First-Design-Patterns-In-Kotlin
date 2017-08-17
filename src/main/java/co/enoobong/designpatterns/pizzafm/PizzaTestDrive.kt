package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
object PizzaTestDrive {

    @JvmStatic
    fun main(args: Array<String>) {
        val nyPizzaStore = NYPizzaStore()
        val chicagoPizzaStore = ChicagoPizzaStore()

        nyPizzaStore.apply {
            var pizza = orderPizza("cheese")
            println("Ethan ordered a " + pizza?.name + "\n")
            pizza = orderPizza("clam")
            println("Ethan ordered a " + pizza?.name + "\n")
            pizza = orderPizza("pepperoni")
            println("Ethan ordered a " + pizza?.name + "\n")
            pizza = orderPizza("veggie")
            println("Ethan ordered a " + pizza?.name + "\n")
       }

        chicagoPizzaStore.apply {
            var pizza = orderPizza("cheese")
            println("Joel ordered a " + pizza?.name + "\n")
            pizza = orderPizza("clam")
            println("Joel ordered a " + pizza?.name + "\n")
            pizza = orderPizza("pepperoni")
            println("Joel ordered a " + pizza?.name + "\n")
            pizza = orderPizza("veggie")
            println("Joel ordered a " + pizza?.name + "\n")
        }
    }

    fun demo() = "2".equals("0", false)
}
