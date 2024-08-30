package lesson12

class DailyWeatherUpdate(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var precipitationDuringTheDay: Boolean
) {
    fun printWeather() {
        println("Daytime temperature is: $daytimeTemperature°C")
        println("Night temperature is: $nightTemperature°C")
        println("Precipitation during the day: ${if (precipitationDuringTheDay) "yes" else "no"}")
    }
}

fun main() {
    val sundayWeather = DailyWeatherUpdate(
        daytimeTemperature = 35,
        nightTemperature = 28,
        precipitationDuringTheDay = false
    )

    println("Weather on Sunday will be:")
    sundayWeather.printWeather()
}