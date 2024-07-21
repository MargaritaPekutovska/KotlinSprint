fun main() {
    loginWithSms()
}

fun loginWithSms() {
    val rangeNumber = 1000L..9999L

    while (true) {
        val phoneCode = rangeNumber.random().toInt()
        println("Your authorization code is: $phoneCode")
        println("Enter the code to log in:")

        val userInput = readln().toInt()

        if (userInput == phoneCode) {
            println("The code was entered correctly. Welcome!")
            break
        } else {
            println("The code was not entered correctly. Try again!")
        }
    }
}