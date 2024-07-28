package lesson1

fun main() {
    trimMargin()
    detailsOfSpaceTravel()
}

fun trimMargin() {
    val yearOfSpaceFlight: Int = 1961
    var takeOffHour: String = "09"
    var takeOffMinute: String = "07"

    val multiString = """
        |Year of space flight: $yearOfSpaceFlight
        |Take off hour: $takeOffHour
        |Take off minute: $takeOffMinute
        """.trimMargin()
    println(multiString)

    var landingHour: String = "10"
    var landingMinute: String = "55"
    println("Landing time: $landingHour:$landingMinute")
}

fun detailsOfSpaceTravel() {
    val flightLength: Long = 40_868_600_000
    val ageOfAstronaut: Byte = 27
    val partOfDay: Float = 0.075f
    val second: Short = 6480
    val partOfTheYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    val spaceTravelInfo = """
        |Fly distance in mm: $flightLength
        |Gagarin's age at the time of the flight: $ageOfAstronaut
        |Part of the day in Space: $partOfDay
        |Time in second which astronaut spent in Space: $second
        |Season of the year when Gagarin was in Space: $partOfTheYear
        |Apogee of Gagarin's orbit in meters: $apogee
        """.trimMargin()
    println(spaceTravelInfo)
}

