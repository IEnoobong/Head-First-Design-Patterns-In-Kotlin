package co.enoobong.designpatterns.starBuzzWithSizes

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
abstract class Beverage {
    enum class Size{TALL, GRAND, VENTI}
    var size = Size.TALL
    open var description = "Unknown Beverage"

    abstract fun cost():Double
}