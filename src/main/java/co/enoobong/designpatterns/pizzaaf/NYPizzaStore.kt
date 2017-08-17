package co.enoobong.designpatterns.pizzaaf


/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class NYPizzaStore : PizzaStore() {

    override fun createPizza(item: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory = NYPizzaIngredientFactory()

        when (item.toLowerCase()) {
            "cheese" -> {

                pizza = CheesePizza(ingredientFactory)
                pizza.name = "New York Style Cheese Pizza"

            }
            "veggie" -> {

                pizza = VeggiePizza(ingredientFactory)
                pizza.name = "New York Style Veggie Pizza"

            }
            "clam" -> {

                pizza = ClamPizza(ingredientFactory)
                pizza.name = "New York Style Clam Pizza"

            }
            "pepperoni" -> {

                pizza = PepperoniPizza(ingredientFactory)
                pizza.name = "New York Style Pepperoni Pizza"

            }
        }
        return pizza
    }
}