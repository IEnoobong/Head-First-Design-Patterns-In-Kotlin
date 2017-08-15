package co.enoobong.designpatterns.weatherobservables.classes

import java.util.Observable

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
class WeatherData : Observable() {
    private var temperature = 0.0f
    private var humidity = 0.0f
    private var pressure = 0.0f

    fun measurementsChanged(){
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float){
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun getTemperature() = this.temperature

    fun getHumidity() = this.humidity

    fun getPressure() = this.pressure
}