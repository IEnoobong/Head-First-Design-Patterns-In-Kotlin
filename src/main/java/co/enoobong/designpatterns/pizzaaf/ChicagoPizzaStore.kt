package co.enoobong.designpatterns.pizzaaf

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class ChicagoPizzaStore: PizzaStore() {

    override fun createPizza(item: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        when (item) {
            "cheese" -> {

                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"

            }
            "veggie" -> {

                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "Chicago Style Veggie Pizza"

            }
            "clam" -> {

                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"

            }
            "pepperoni" -> {

                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "Chicago Style Pepperoni Pizza"

            }
        }
        return pizza
    }
}