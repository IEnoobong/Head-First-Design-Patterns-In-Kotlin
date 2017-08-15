package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Whip(val beverage: Beverage): CondimentDecorator() {
    override var description = beverage.description + ", Whip"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }

}