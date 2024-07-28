fun main() {
    loginVerification()
}

const val MINIMAL_NUMBER = 1
const val MAXIMAL_NUMBER = 9
const val TRIES_NUMBER = 3

private val rangeOfNumbers = IntRange(MINIMAL_NUMBER, MAXIMAL_NUMBER)

fun loginVerification() {
    var triesNumber = TRIES_NUMBER

    while (triesNumber > 0) {
        val firstRandomNumber = rangeOfNumbers.random()
        val secondRandomNumber = rangeOfNumbers.random()
        println(
            "To prove that you are not a bot, please solve this simple exercise: " +
                    "What is the sum of $firstRandomNumber + $secondRandomNumber =..."
        )
        val usersAnswer = readln().toInt()
        triesNumber--

        if (firstRandomNumber + secondRandomNumber == usersAnswer) {
            println("Welcome!")
            break
        } else {
            println("Entered answer is wrong!")
        }
        if (triesNumber == 0) {
            println("Access denied")
        }

    }
}
