package co.enoobong.designpatterns.weatherobservables

/**
 * @author Ibanga Enoobong I
 * @since 15-Aug-17.
 */
object WeatherStationHeatIndex {

    @JvmStatic fun main(args: Array<String>) {
        val weatherData = WeatherData()

        weatherData.apply {
            CurrentConditionsDisplay(weatherData)
            StatisticsDisplay(weatherData)
            ForecastDisplay(weatherData)
            HeatIndexDisplay(weatherData)
            setMeasurements(80f, 65f, 30.4f)
            setMeasurements(82f, 70f, 29.2f)
            setMeasurements(78f, 90f, 29.2f)
        }
    }
}