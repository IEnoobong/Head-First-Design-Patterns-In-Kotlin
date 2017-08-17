package co.enoobong.designpatterns.pizzas

import Pizza

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class PepperoniPizza: Pizza() {
    init {
        name = "Pepperoni Pizza"
        dough = "Crust"
        sauce = "Marinara sauce"
        toppings.add("Sliced Pepperoni")
        toppings.add("Sliced Onion")
        toppings.add("Grated parmesan cheese")
    }
}