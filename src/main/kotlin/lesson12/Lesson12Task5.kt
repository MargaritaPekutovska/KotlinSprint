package lesson12

import kotlin.random.Random

class DailyWeatherDegrees5(
    daytimeTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitationDuringTheDay: Boolean
) {

    var daytimeTemperatureCelsius: Int
    var nightTemperatureCelsius: Int
    var precipitationDuringTheDay: Boolean = precipitationDuringTheDay


    init {
        daytimeTemperatureCelsius = convertKelvinInCelsius(daytimeTemperatureKelvin).toInt()
        nightTemperatureCelsius = convertKelvinInCelsius(nightTemperatureKelvin).toInt()

    }

    fun printWeather() {
        println("Daytime temperature is: ${daytimeTemperatureCelsius}°C")
        println("Night temperature is: ${nightTemperatureCelsius}°C")
        println("Precipitation during the day: ${if (precipitationDuringTheDay) "yes" else "no"}")
    }

    private fun convertKelvinInCelsius(temperatureInKelvin: Int): Double {
        return temperatureInKelvin - ZERO_OFFSET
    }
}

const val ZERO_OFFSET = 273.15
const val MAX_TEMPERATURE = 300

fun main() {
    val monthlyWeatherList = ArrayList<DailyWeatherDegrees5>()
    val rangeForWeatherInKelvins = IntRange(ZERO_OFFSET.toInt(), MAX_TEMPERATURE)
    for (i in 0..30) {
        val weather = DailyWeatherDegrees5(
            daytimeTemperatureKelvin = rangeForWeatherInKelvins.random(),
            nightTemperatureKelvin = rangeForWeatherInKelvins.random(),
            precipitationDuringTheDay = Random.nextBoolean()
        )
        monthlyWeatherList.add(weather)
    }

    val nightTemperatureList = monthlyWeatherList.map {
        it.nightTemperatureCelsius
    }

    val dailyTemperatureList = monthlyWeatherList.map {
        it.daytimeTemperatureCelsius
    }

    val daysWithPrecipitation = monthlyWeatherList.filter {
        it.precipitationDuringTheDay
    }

    val averageDailyWeather = dailyTemperatureList.average().toInt()
    val averageNightWeather = nightTemperatureList.average().toInt()
    val numberOfDaysWithPrecipitation = daysWithPrecipitation.size

    println(
        "average Daily Weather = $averageDailyWeather, average Night Weather = $averageNightWeather, " +
                "number Of Days With Precipitation = $numberOfDaysWithPrecipitation"
    )

}