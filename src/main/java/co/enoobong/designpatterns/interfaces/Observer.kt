package co.enoobong.designpatterns.interfaces

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}