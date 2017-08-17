package co.enoobong.designpatterns.pizzas

import Pizza

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class ClamPizza: Pizza() {

    init {
        name = "Clam Pizza"
        dough = "Thin crust"
        sauce = "White garlic sauce"
        toppings.add("Clams")
        toppings.add("Grated parmesan cheese")
    }
}