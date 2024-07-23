fun main() {
    evenNumbersApps()
}

fun evenNumbersApps() {
    println("please input number:")
    val userNumber = readln().toInt()

    var enteredNumber = userNumber

    for (i in 0..enteredNumber step 2) {
        println(i)
    }
}