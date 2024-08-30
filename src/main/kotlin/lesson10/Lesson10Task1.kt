package lesson10

fun main() {
    diceGame()
}

const val MIN_NUMBER = 1
const val MAX_NUMBER = 6

private val rangeOfNumbers = IntRange(MIN_NUMBER, MAX_NUMBER)

private fun diceGame() {
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

private fun rollDice(): Int = rangeOfNumbers.random()