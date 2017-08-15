package co.enoobong.designpatterns.weatherobservables.classes

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import java.util.Observable
import java.util.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class CurrentConditionsDisplay(observable: Observable) : Observer, DisplayElement {


    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        observable.addObserver(this)
    }
    override fun update(obs: Observable?, arg: Any?) {
        if (obs is WeatherData){
            val weatherData = obs
            this.temperature = weatherData.getTemperature()
            this.humidity = weatherData.getHumidity()
            display()
        }
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }
}