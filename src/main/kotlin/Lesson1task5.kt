fun main(){
timeSpendingInSpace()
}

const val totalSecondInSpace: Int = 6480
const val secondsInHour: Int = 3600
const val secondInMinute: Int = 60

fun timeSpendingInSpace() {
    val totalSecondInSpace = totalSecondInSpace
    val secondsInHour = secondsInHour
    val fullHoursInSpace = totalSecondInSpace / secondsInHour
    val remainderOfTheDivision = totalSecondInSpace%secondsInHour

    val fullMinuteInSpace = remainderOfTheDivision / secondInMinute
    val fullSecondsInSpace = remainderOfTheDivision % secondInMinute

    val formatedString = String.format("%02d:%02d:%02d",
        fullHoursInSpace,
        fullMinuteInSpace,
        fullSecondsInSpace)

    println(formatedString)
}
