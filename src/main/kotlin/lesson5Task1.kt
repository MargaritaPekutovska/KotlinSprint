import java.util.*

fun main() {
    val firstNumber = Random().nextInt()
    val secondNumber = Random().nextInt()
    loginVerification(
        firstNumber = firstNumber,
        secondNumber = secondNumber,
        result = firstNumber + secondNumber
    )
}

fun loginVerification(firstNumber: Int, secondNumber: Int, result: Int) {
    val exampleForLogin: Int = firstNumber + secondNumber

    if (exampleForLogin == result) {
        println("Welcome!")
    } else {
        println("Access is denied")
    }
}