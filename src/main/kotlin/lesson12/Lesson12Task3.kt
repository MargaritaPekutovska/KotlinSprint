package lesson12

class DailyWeatherDegrees2(
    daytimeTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitationDuringTheDay: Boolean,
) {
    private val daytimeTemperatureCelsius: Int = (daytimeTemperatureKelvin - ZERO_OFFSET).toInt()
    private val nightTemperatureCelsius: Int = (nightTemperatureKelvin - ZERO_OFFSET).toInt()
    private val isPrecipitationDuringTheDay: Boolean = precipitationDuringTheDay

    fun printWeather() {
        println("Daytime temperature is: ${daytimeTemperatureCelsius}°C")
        println("Night temperature is: ${nightTemperatureCelsius}°C")
        println("Precipitation during the day: ${if (isPrecipitationDuringTheDay) "yes" else "no"}")
    }

    private companion object {
        const val ZERO_OFFSET = 273.15
    }
}

fun main() {
    val dailyWeather = DailyWeatherDegrees2(
        daytimeTemperatureKelvin = 300,
        nightTemperatureKelvin = 290,
        precipitationDuringTheDay = true
    )

    dailyWeather.printWeather()
}