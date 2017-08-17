package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class DependentPizzaStore {

    fun createPizza(style: String, type: String): Pizza? {
        var pizza: Pizza? = null
        when (style) {
            "NY" -> when (type) {
                "cheese" -> pizza = NYStyleCheesePizza()
                "veggie" -> pizza = NYStyleVeggiePizza()
                "clam" -> pizza = NYStyleClamPizza()
                "pepperoni" -> pizza = NYStylePepperoniPizza()
            }
            "Chicago" -> when (type) {
                "cheese" -> pizza = ChicagoStyleCheesePizza()
                "veggie" -> pizza = ChicagoStyleVeggiePizza()
                "clam" -> pizza = ChicagoStyleClamPizza()
                "pepperoni" -> pizza = ChicagoStylePepperoniPizza()
            }
            else -> {
                println("Error: invalid type of pizza")
                return null
            }
        }
        pizza?.apply {
            prepare()
            bake()
            cut()
            box()
        }
        return pizza
    }
}
