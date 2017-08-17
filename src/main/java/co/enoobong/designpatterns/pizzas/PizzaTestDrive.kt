package co.enoobong.designpatterns.pizzas

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
object PizzaTestDrive {

    @JvmStatic
    fun main(args: Array<String>){
        val factory = SimplePizzaFactory()
        val store = PizzaStore(factory)

        store.apply {
            var pizza = orderPizza("cheese")
            println("We ordered a " + pizza?.name)
            println(pizza)
            pizza = orderPizza("veggie")
            println("We ordered a " + pizza?.name)
            println(pizza)
            pizza = orderPizza("pepperoni")
            println("We ordered a " + pizza?.name)
            println(pizza)
        }
    }
}