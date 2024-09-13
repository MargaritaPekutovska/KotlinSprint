import kotlin.random.Random
import kotlin.random.nextInt

interface Dice2 {
    fun rollDice()
}

class FourSidedDice(private var randomNumberTill4: Int = 0) : Dice2 {
    override fun rollDice() {
        randomNumberTill4 = Random.nextInt(1, 5)
        println("Your firs number is $randomNumberTill4")
    }

}

class SixSidedDice(private var randomNumberTill6: Int = 0) : Dice2 {
    override fun rollDice() {
        randomNumberTill6 = Random.nextInt(1, 7)
        println("Your second number is $randomNumberTill6")
    }
}

class EightSidedDice(private var randomNumberTill8: Int = 0) : Dice2 {
    override fun rollDice() {
        randomNumberTill8 = Random.nextInt(1, 9)
        println("Your third number is $randomNumberTill8")
    }
}

fun main() {
    val listOfDice = arrayListOf<Dice2>(
        FourSidedDice(),
        SixSidedDice(),
        EightSidedDice()
    )
    listOfDice.forEach { it.rollDice() }
}