class DailyWeather {
    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitationDuringTheDay: Boolean = false

    fun printWeather() {
        println("Daytime temperature is :$daytimeTemperature°C")
        println("Night temperature is :$nightTemperature °C")
        println("Precipitation during the day:${if (precipitationDuringTheDay) "yes" else "no"}")
    }
}

fun main() {
    val weatherFirstDay = DailyWeather()
    weatherFirstDay.daytimeTemperature = 22
    weatherFirstDay.nightTemperature = 12
    weatherFirstDay.precipitationDuringTheDay = true

    val weatherSecondDay = DailyWeather()
    weatherSecondDay.daytimeTemperature = 30
    weatherSecondDay.nightTemperature = 18
    weatherSecondDay.precipitationDuringTheDay = false

    println("Weather for first day:")
    weatherFirstDay.printWeather()

    println("Weather for second day:")
    weatherSecondDay.printWeather()
}
