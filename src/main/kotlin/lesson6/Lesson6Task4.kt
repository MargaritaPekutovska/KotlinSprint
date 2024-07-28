package lesson6

fun main() {
    guessNumberGame()
}

const val MINIMUM_GUESS_NUMBER = 1
const val MAX_GUESS_NUMBER = 9
const val MAX_TRIES_NUMBER = 5

private val rangeOfNumbers = IntRange(MINIMUM_GUESS_NUMBER, MAX_GUESS_NUMBER)

fun guessNumberGame() {
    val targetNumber = rangeOfNumbers.random()
    var triesLeft = MAX_TRIES_NUMBER
    println("You have 5 tries to guess winning number")

    while (triesLeft > 0) {
        println("Write your guess number")
        val userNumber = readln().toInt()
        triesLeft--

        if (userNumber == targetNumber) {
            println("It was a marvelous game!")
            break
        } else {
            println("Wrong number!")
        }
    }
    println("The winning number was $targetNumber")
}