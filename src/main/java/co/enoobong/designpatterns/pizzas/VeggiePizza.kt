package co.enoobong.designpatterns.pizzas

import Pizza

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class VeggiePizza: Pizza() {

    init {
        name = "Veggie Pizza"
        dough = "Crust"
        sauce = "Marinara sauce"
        toppings.add("Shredded mozzarella")
        toppings.add("Grated parmesan")
        toppings.add("Diced onion")
        toppings.add("Sliced mushrooms")
        toppings.add("Sliced red pepper")
        toppings.add("Sliced black olives")
    }
}