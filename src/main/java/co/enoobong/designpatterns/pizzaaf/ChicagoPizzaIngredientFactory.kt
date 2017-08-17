package co.enoobong.designpatterns.pizzaaf

/**
 * @author Ibanga Enoobong I
 * @since 17-Aug-17.
 */
class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(BlackOlives(), Spinach(), Eggplant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}