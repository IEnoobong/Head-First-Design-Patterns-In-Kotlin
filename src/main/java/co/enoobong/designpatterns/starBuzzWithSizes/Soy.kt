package co.enoobong.designpatterns.starBuzzWithSizes

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class Soy(val beverage: Beverage):CondimentDecorator() {
    override var description = beverage.description + ", Soy "

    override fun cost(): Double {
        var cost = beverage.cost()
        when{
            beverage.size == Size.TALL -> cost += .10
            beverage.size == Size.GRAND -> cost += .15
            beverage.size == Size.VENTI -> cost += .20
        }
        return cost
    }

}