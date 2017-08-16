package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class DarkRoast: Beverage() {
    init {
        description = "Dark Roast"
    }

    override fun cost(): Double {
        return .99
    }
}