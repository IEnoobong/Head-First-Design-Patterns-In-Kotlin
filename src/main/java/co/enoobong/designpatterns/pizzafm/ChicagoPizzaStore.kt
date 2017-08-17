package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class ChicagoPizzaStore: PizzaStore() {

    override fun createPizza(type: String) = when(type){
        "cheese" -> ChicagoStyleCheesePizza()
        "veggie" -> ChicagoStyleVeggiePizza()
        "clam" -> ChicagoStyleClamPizza()
        "pepperoni" -> ChicagoStylePepperoniPizza()
        else -> null
    }
}