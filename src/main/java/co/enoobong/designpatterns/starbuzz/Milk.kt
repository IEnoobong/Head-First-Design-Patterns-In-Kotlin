package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Milk(val beverage: Beverage): CondimentDecorator() {

    override var description = beverage.description + ", Milk"

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}