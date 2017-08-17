package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class ChicagoStyleClamPizza: Pizza() {
    init {
        name = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}