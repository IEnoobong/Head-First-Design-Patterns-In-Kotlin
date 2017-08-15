package co.enoobong.designpatterns.weatherobservables

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object WeatherStationHeatIndex {

    @JvmStatic fun main(args: Array<String>) {
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