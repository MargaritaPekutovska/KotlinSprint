class DailyWeatherDegrees4(
    daytimeTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitationDuringTheDay: Boolean
) {

    private var daytimeTemperatureCelsius: Int
    private var nightTemperatureCelsius: Int
    private var precipitationDuringTheDay: Boolean = precipitationDuringTheDay

    init {
        daytimeTemperatureCelsius = convertKelvinInCelsius(daytimeTemperatureKelvin).toInt()
        nightTemperatureCelsius = convertKelvinInCelsius(nightTemperatureKelvin).toInt()
        printWeather()
    }

    private fun printWeather() {
        println("Daytime temperature is: ${daytimeTemperatureCelsius}°C")
        println("Night temperature is: ${nightTemperatureCelsius}°C")
        println("Precipitation during the day: ${if (precipitationDuringTheDay) "yes" else "no"}")
    }

    private fun convertKelvinInCelsius(temperatureInKelvin: Int): Double {
        return temperatureInKelvin - ZERO_OFFSET
    }

    private companion object {
        const val ZERO_OFFSET = 273.15
    }
}

fun main() {
    DailyWeatherDegrees4(
        daytimeTemperatureKelvin = 300,
        nightTemperatureKelvin = 290,
        precipitationDuringTheDay = true
    )
}