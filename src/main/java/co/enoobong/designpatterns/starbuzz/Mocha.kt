package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Mocha(val beverage: Beverage): CondimentDecorator() {

    override var description: String = beverage.description + ", Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost()
    }

}