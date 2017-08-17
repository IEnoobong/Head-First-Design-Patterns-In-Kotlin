package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class NYPizzaStore: PizzaStore() {

    override fun createPizza(type: String) = when (type.toLowerCase()) {
        "cheese" -> NYStyleCheesePizza()
        "veggie" -> NYStyleVeggiePizza()
        "clam" -> NYStyleClamPizza()
        "pepperoni" -> NYStylePepperoniPizza()
        else -> null
    }


}