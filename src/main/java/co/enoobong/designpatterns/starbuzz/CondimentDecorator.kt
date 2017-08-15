package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
abstract class CondimentDecorator : Beverage() {
    abstract override var description: String
}