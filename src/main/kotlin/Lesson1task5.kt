fun main() {
    timeSpendingInSpace(totalSecondsInSpace = 6480)
}

const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60

fun timeSpendingInSpace(totalSecondsInSpace: Int) {
    val fullHoursInSpace = totalSecondsInSpace / SECONDS_IN_HOUR
    val remainderOfTheDivision = totalSecondsInSpace % SECONDS_IN_HOUR

    val fullMinuteInSpace = remainderOfTheDivision / SECONDS_IN_MINUTE
    val fullSecondsInSpace = remainderOfTheDivision % SECONDS_IN_MINUTE

    val formatedString = String.format(
        "%02d:%02d:%02d",
        fullHoursInSpace,
        fullMinuteInSpace,
        fullSecondsInSpace
    )

    println(formatedString)
}
