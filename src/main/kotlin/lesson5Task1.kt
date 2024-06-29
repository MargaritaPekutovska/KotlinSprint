fun main() {
    loginVerification(firstNumber = 2, secondNumber = 2, result = 4)
}

fun loginVerification(firstNumber: Int, secondNumber: Int, result: Int) {
    val exampleForLogin:Int = firstNumber + secondNumber

    if (exampleForLogin == result) {
        println("Welcome!")
    } else {
        println("Access is denied")
    }
}