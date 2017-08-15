package co.enoobong.designpatterns.weatherobservables

import co.enoobong.designpatterns.weather.interfaces.DisplayElement
import java.util.Observable
import java.util.Observer

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class HeatIndexDisplay(observable: Observable): Observer, DisplayElement {

    private var heatIndex = 0.0f

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable?, arg: Any?) {
        if (observable is WeatherData) {
            val weatherData = observable
            val t = weatherData.getTemperature()
            val rh = weatherData.getHumidity()
            heatIndex = (16.923 + 0.185212 * t + 5.37941 * rh - 0.100254 * t.toDouble() * rh.toDouble() +
                    0.00941695 * (t * t) +
                    0.00728898 * (rh * rh) +
                    0.000345372 * (t * t * rh) - 0.000814971 * (t * rh * rh) + 0.0000102102 * (t * t * rh * rh) - 0.000038646 * (t * t * t) +
                    0.0000291583 * (rh * rh * rh) +
                    0.00000142721 * (t * t * t * rh) +
                    0.000000197483 * (t * rh * rh * rh) - 0.0000000218429 * (t * t * t * rh * rh) + 0.000000000843296 * (t * t * rh * rh * rh) - 0.0000000000481975 * (t * t * t * rh * rh * rh)).toFloat()
            display()
        }
    }

    override fun display() {
        println("Heat index is " + heatIndex)
    }
}