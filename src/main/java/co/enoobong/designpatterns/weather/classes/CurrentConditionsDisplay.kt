package co.enoobong.designpatterns.weather.classes

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import co.enoobong.designpatterns.weather.interfaces.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    private var temperature = 0.0f
    private var humidity = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity % humidity")
    }
}