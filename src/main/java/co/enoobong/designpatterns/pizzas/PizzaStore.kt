package co.enoobong.designpatterns.pizzas

import Pizza

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class PizzaStore(private val factory: SimplePizzaFactory) {

    fun orderPizza(type: String): Pizza? {
        val pizza = factory.createPizza(type)

        pizza?.apply {
            prepare()
            bake()
            cut()
            box()
        }

        return pizza
    }
}