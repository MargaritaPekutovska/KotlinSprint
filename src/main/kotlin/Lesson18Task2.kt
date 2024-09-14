open class Dice2(private val numberOfSides: Int) {
    fun rollDice() {
        val rolledNumber = IntRange(1, numberOfSides).random()
        println("Your firs number is $rolledNumber")
    }
}

class FourSidedDice : Dice2(numberOfSides = 4)

class SixSidedDice : Dice2(numberOfSides = 6)

class EightSidedDice : Dice2(numberOfSides = 8)

fun main() {
    val listOfDice = arrayListOf<Dice2>(
        FourSidedDice(),
        SixSidedDice(),
        EightSidedDice()
    )
    listOfDice.forEach { it.rollDice() }
}