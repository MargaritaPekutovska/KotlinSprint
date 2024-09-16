package lesson15

interface WeatherStationStarts {
    fun getData(): String
    fun sendToServer()
    val location: String
}

class Temperature(
    override val location: String,
    val temperature: Double
) : WeatherStationStarts {
    override fun getData(): String {
        return "Temperature at $location: $temperature °C"
    }

    override fun sendToServer() {
        println("Sending temperature data to the server: ${getData()}")
    }
}

class PrecipitationAmount(
    override val location: String,
    val amount: Double
) : WeatherStationStarts {
    override fun getData(): String {
        return "Precipitation at $location: $amount mm"
    }

    override fun sendToServer() {
        println("Sending precipitation data to the server:${getData()}")
    }
}

class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStarts) {
        weatherData.sendToServer()
    }
}

fun main() {
    val temperatureData = Temperature("Berlin", 32.3)
    val precipitationData = PrecipitationAmount("London", 26.2)

    val server = WeatherServer()

    server.sendMessage(temperatureData)
    server.sendMessage(precipitationData)
}

