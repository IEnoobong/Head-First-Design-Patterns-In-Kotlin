package co.enoobong.designpatterns.pizzas

import Pizza



/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class CheesePizza : Pizza() {
    init {
        name = "Cheese Pizza"
        dough = "Regular Crust"
        sauce = "Marinara Pizza Sauce"
        toppings.add("Fresh Mozzarella")
        toppings.add("Parmesan")
    }
}