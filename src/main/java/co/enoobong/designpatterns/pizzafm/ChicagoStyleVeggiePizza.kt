package co.enoobong.designpatterns.pizzafm

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class ChicagoStyleVeggiePizza : Pizza() {
    init {
        name = "Chicago Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }

    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}