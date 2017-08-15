package co.enoobong.designpatterns.starbuzz

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
class HouseBlend: Beverage() {
    init {
        description = "House Blend"
    }

    override fun cost(): Double {
        return .89
    }
}