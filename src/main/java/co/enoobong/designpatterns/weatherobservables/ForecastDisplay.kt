package co.enoobong.designpatterns.weatherobservables

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import java.util.Observable
import java.util.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class ForecastDisplay(observable: Observable) : Observer, DisplayElement {

    private var currentPressure = 29.92f
    private var lastPressure: Float = 0.toFloat()

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable?, arg: Any?) {
        if (observable is WeatherData) {
            val weatherData = observable
            lastPressure = currentPressure
            currentPressure = weatherData.getPressure()
            display()
        }
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}