package co.enoobong.designpatterns.weather.classes

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import co.enoobong.designpatterns.weather.interfaces.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class ForecastDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    private var currentPressure = 0.0f
    private var lastPressure = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure){
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure){
            println("More of the same")
        } else if (currentPressure < lastPressure){
            println("Watch out for cooler,rainy weather")
        }
    }
}