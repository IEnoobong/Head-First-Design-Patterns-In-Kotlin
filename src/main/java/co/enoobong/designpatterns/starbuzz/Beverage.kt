package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
abstract class Beverage {
    open var description = "Unknown Beverage"

    abstract fun cost(): Double
}