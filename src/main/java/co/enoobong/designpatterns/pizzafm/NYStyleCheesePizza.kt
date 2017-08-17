package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class NYStyleCheesePizza: Pizza() {
    init {
        name = "NY Style Sauce and Cheese Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"

        toppings.add("Grated Reggiano Cheese")
    }
}