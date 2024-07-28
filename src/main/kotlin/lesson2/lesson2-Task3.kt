package lesson2

fun main() {
    trainSchedule(travelTime = 457)
}

const val MINUTES_IN_HOUR = 60

fun trainSchedule(travelTime: Int) {
    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val departureTimeInMinutes = hourOfDeparture * MINUTES_IN_HOUR + minutesOfDeparture
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime

    val hourArrival = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val minutesArrival = hourArrival % MINUTES_IN_HOUR

    println("Arrival time $hourArrival:$minutesArrival")
}