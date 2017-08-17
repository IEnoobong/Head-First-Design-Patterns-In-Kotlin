package co.enoobong.designpatterns.pizzaaf

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
interface PizzaIngredientFactory {

    fun createDough():Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): Array<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}