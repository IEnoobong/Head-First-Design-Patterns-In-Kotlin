package co.enoobong.designpatterns.weather.classes

/**
 * @author Ibanga Enoobong I
 * @since 14-Aug-17.
 */
object WeatherStation {

    @JvmStatic fun main(array: Array<String>) {
        val weatherData = WeatherData()

        CurrentConditionsDisplay(weatherData)
        StatisticsDisplay(weatherData)
        ForecastDisplay(weatherData)
        HeatIndexDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
        weatherData.setMeasurements(82f, 70f, 29.2f)
        weatherData.setMeasurements(78f, 90f, 29.2f)

    }
}