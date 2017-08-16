package co.enoobong.designpatterns.starBuzzWithSizes

/**
 * @author Ibanga Enoobong I
 * @since 16-Aug-17.
 */
class HouseBlend: Beverage() {

    init {
        description = "House Blend"
    }

    override fun cost(): Double {
        return .89
    }
}