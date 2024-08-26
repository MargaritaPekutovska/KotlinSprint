class DailyWeatherDegrees{

    private var daytimeTemperatureCelsius: Int=0
    private var nightTemperatureCelsius: Int=0
    private var precipitationDuringTheDay: Boolean=false

    constructor(daytimeTemperatureKelvin:Int, nightTemperatureKelvin:Int,precipitationDuringTheDay:Boolean){
        daytimeTemperatureCelsius=convertKelvinInCelsius(daytimeTemperatureKelvin).toInt()
        nightTemperatureCelsius=convertKelvinInCelsius(nightTemperatureKelvin).toInt()
        this.precipitationDuringTheDay=precipitationDuringTheDay
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

fun main(){
    val dailyWeather=DailyWeatherDegrees(
        daytimeTemperatureKelvin = 300,
        nightTemperatureKelvin= 290,
        precipitationDuringTheDay=true
    )
    dailyWeather.printWeather()
}