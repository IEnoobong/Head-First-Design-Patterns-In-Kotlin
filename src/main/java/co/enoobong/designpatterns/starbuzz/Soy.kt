package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Soy(val beverage: Beverage): CondimentDecorator() {

    override var description = beverage.description + ", Soy"

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}