import kotlin.random.Random

class Dice {

    private val randomNumber = generateRandomNumber()

    private fun generateRandomNumber(): Int {
        val minNumber = 1
        val maxNumber = 7
        return Random.nextInt(minNumber, maxNumber)
    }

    fun printRandomNumber() {
        println("The number is $randomNumber")
    }
}

fun main() {
    val dice = Dice()
    dice.printRandomNumber()
}