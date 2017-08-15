package co.enoobong.designpatterns.weather.classes

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import co.enoobong.designpatterns.weather.interfaces.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement{
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp){
            maxTemp = temp
        }

        if (temp < minTemp){
            minTemp = temp
        }

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = " + (tempSum / numReadings) + " / $maxTemp / $minTemp")

    }
}