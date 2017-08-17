package co.enoobong.designpatterns.pizzaaf

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
abstract class PizzaStore {

    protected abstract fun createPizza(item: String): Pizza?

    fun orderPizza(type: String): Pizza?{
        val pizza = createPizza(type)
        pizza?.apply {
            println("--- Making a " + pizza.name + " ---")
            prepare()
            bake()
            cut()
            box()
        }
        return pizza
    }
}