package lesson5

const val LOGIN_DATA = 20

fun main() {
    println("Please enter your login data")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    if ((firstNumber + secondNumber) == LOGIN_DATA) {
        println("Welcome!")
    } else {
        println("Access denied")
    }
}