package co.enoobong.designpatterns.pizzas

import Pizza


/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class SimplePizzaFactory {

    fun createPizza(type: String): Pizza? {
        return when(type){
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            "clam" ->  ClamPizza()
            "veggie" -> VeggiePizza()
            else -> null
        }
    }
}