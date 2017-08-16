package co.enoobong.designpatterns.starBuzzWithSizes

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class Mocha(val beverage: Beverage) : CondimentDecorator() {
    override var description: String = beverage.description + ", Mocha"

    override fun cost(): Double {
        var cost = beverage.cost()
        when{
            beverage.size == Size.TALL -> cost += .20
            beverage.size == Size.GRAND -> cost += .25
            beverage.size == Size.VENTI -> cost += .30
        }
        return cost
    }

}