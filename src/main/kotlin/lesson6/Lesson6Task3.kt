package lesson6

fun main() {
    timerAppPro()
}

fun timerAppPro() {
    println("Enter amount of seconds for the countdown")
    val enteredTimeSeconds = readln().toInt()
    var countDown = enteredTimeSeconds

    while (countDown > 0) {
        Thread.sleep(1000)
        countDown--
        println("$countDown seconds left")
    }
    println("$enteredTimeSeconds seconds have passed")
}