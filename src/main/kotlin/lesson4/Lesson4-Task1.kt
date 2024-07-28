package lesson4

fun main() {
    restaurantReservation()
}

const val NUMBER_OF_TABLES = 13
fun restaurantReservation() {
    var reservationToday = NUMBER_OF_TABLES
    var vacanTablesForTomorrow = 4
    var reservationTomorrow = NUMBER_OF_TABLES - vacanTablesForTomorrow


    val hasVacantTablesForToday = reservationToday < NUMBER_OF_TABLES
    val hasVacantTablesForTomorrow = reservationTomorrow < NUMBER_OF_TABLES
    println(
        " Has vacant tables for today $hasVacantTablesForToday\n " +
                "Has vacant tables for tomorrow $hasVacantTablesForTomorrow "
    )
}