package co.enoobong.designpatterns.interfaces

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}