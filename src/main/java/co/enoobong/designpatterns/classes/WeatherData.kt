package co.enoobong.designpatterns.classes

import co.enoobong.designpatterns.interfaces.Observer
import co.enoobong.designpatterns.interfaces.Subject

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class WeatherData : Subject{

    val observers: ArrayList<Observer> = ArrayList()
    var temperature = 0.0f
    var humidity = 0.0f
    var pressure = 0.0f


    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if ( i>= 0){
            observers.removeAt(i)
        }
    }

    override fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun measurementsChanged(){
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float){
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}