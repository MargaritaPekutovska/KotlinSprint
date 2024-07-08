const val LOGIN_DATA = 20

fun main() {
    println("Please enter your login data")
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    if ((firstNumber + secondNumber) == LOGIN_DATA) {
        println("Welcome!")
    } else {
        println("Access denied")
    }
}