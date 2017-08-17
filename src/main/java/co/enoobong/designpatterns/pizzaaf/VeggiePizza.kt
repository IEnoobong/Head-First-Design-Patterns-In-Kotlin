package co.enoobong.designpatterns.pizzaaf

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class VeggiePizza(private val ingredientFactory: PizzaIngredientFactory): Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        veggies = ingredientFactory.createVeggies()
    }
}