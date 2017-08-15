package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Decaf: Beverage() {
    init {
        description = "Decaf"
    }

    override fun cost(): Double {
        return 1.05
    }
}