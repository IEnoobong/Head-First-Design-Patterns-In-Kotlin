package co.enoobong.designpatterns.weatherobservables.classes

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import java.util.Observable
import java.util.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class StatisticsDisplay(observable: Observable) : Observer, DisplayElement {

    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable?, arg: Any?) {
        if (observable is WeatherData) {
            val weatherData = observable
            val temp = weatherData.getTemperature()
            tempSum += temp
            numReadings++

            if (temp > maxTemp) {
                maxTemp = temp
            }

            if (temp < minTemp) {
                minTemp = temp
            }

            display()
        }
    }

    override fun display() {
        println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/ $maxTemp/$minTemp")
    }
}