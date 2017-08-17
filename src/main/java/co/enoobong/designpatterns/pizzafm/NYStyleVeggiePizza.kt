package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class NYStyleVeggiePizza: Pizza() {
    init {
        name = "NY Style Veggie Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"

        toppings.add("Grated Reggiano Cheese")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }
}