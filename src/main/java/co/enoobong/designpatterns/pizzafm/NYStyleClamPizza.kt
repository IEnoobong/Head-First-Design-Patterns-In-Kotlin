package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class NYStyleClamPizza: Pizza(){

    init {
        name = "NY Style Clam Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"

        toppings.add("Grated Reggiano Cheese")
        toppings.add("Fresh Clams from Long Island Sound")
    }
}