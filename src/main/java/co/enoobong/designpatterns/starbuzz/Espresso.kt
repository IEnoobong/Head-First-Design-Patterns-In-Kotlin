package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class Espresso: Beverage() {

    init {
        description = "Espresso"
    }
    override fun cost(): Double {
        return 1.99
    }
}