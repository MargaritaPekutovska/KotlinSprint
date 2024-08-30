package lesson10

fun main() {
    diceGame2()
}

const val MIN_RANGE_NUMBER = 1
const val MAX_RANGE_NUMBER = 6
const val PLAYERS_ANSWER = "Yes"

private val rangeOfNumbers = IntRange(MIN_RANGE_NUMBER, MAX_RANGE_NUMBER)

private fun diceGame2() {
    do {
        playDiceGame()
        println("Do you want to play again?")
        val playersAnswer = readln()
    } while (playersAnswer.equals(PLAYERS_ANSWER, ignoreCase = true))
}

private fun rollDice(): Int = rangeOfNumbers.random()

private fun playDiceGame() {
    println("Player 1 rolls a dice")
    val playersResult = rollDice()
    println("Player 1 dice roll came up as $playersResult")

    println("Now computer rolls a dice")
    val computerResult = rollDice()
    println("Computer dice roll came up as $computerResult")

    if (playersResult > computerResult)
        println("The humanity has won!")
    else if (computerResult > playersResult)
        println("Machines took over the humanity")
}
