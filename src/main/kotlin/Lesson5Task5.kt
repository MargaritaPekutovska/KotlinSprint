import kotlin.random.Random

fun main(){
lotteryAppUpgrade()
}
const val LOTTERY_UPPER_BOUNDARY=42
const val LOTTERY_LOWER_BOUNDARY=0

fun lotteryAppUpgrade(){
    println("Enter your three lotery numbers (0-42):")
    val numberOne= readLine()!!.toInt()
    val numberTwo= readLine()!!.toInt()
    val numberThree= readLine()!!.toInt()

    val inputList= mutableListOf(numberOne, numberTwo, numberThree)

    val firstWinningNumber = Random.nextInt(LOTTERY_LOWER_BOUNDARY, LOTTERY_UPPER_BOUNDARY + 1)
    val secondWinningNumber = Random.nextInt(LOTTERY_LOWER_BOUNDARY,LOTTERY_UPPER_BOUNDARY + 1)
    val thirdWinningNumber = Random.nextInt(LOTTERY_LOWER_BOUNDARY,LOTTERY_UPPER_BOUNDARY + 1)

    val winningNumber = mutableListOf(firstWinningNumber, secondWinningNumber, thirdWinningNumber)

    val matchedNumbers = inputList.intersect(winningNumber).size

    when (matchedNumbers) {
        3 -> println("Congratulations! You won the super prize!")
        2 -> println("Congratulations! You won a prize!")
        1 -> println("Congratulations! You won a consolation prize")
        else -> println("Sorry, no matching numbers. Better luck next time!")
    }

    println("Your numbers were: $inputList")
    println("Winning numbers were: $winningNumber")
}