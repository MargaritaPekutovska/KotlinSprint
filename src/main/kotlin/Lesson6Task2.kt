fun main() {
    timerApp()
}

const val ONE_SECOND_IN_MILLIS = 1000L

fun timerApp() {
    println("Enter amount of seconds for the countdown")
    val enteredTimeSeconds = readln().toInt()

    Thread.sleep(ONE_SECOND_IN_MILLIS * enteredTimeSeconds)
    println("$enteredTimeSeconds seconds have passed")
}