fun main() {
    timerApp()
}

fun timerApp() {
    println("Enter amount of seconds for the countdown")
    val enteredTimeSeconds = readln().toInt()
    var countDown = enteredTimeSeconds

    while (countDown > 0) {
        Thread.sleep(1000)
        countDown--
    }
    println("$enteredTimeSeconds seconds have passed")
}