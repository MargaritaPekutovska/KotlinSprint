import kotlin.random.Random

fun main() {
    lotteryApp()
}

const val NUMBER_FROM = 0
const val NUMBER_TO = 42

fun lotteryApp() {
    println("Select number from $NUMBER_FROM to $NUMBER_TO")
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    val firstWinningNumber = Random.nextInt(NUMBER_FROM, NUMBER_TO)
    val secondWinningNumber = Random.nextInt(NUMBER_FROM, NUMBER_TO)

    if (firstNumber == firstWinningNumber && secondNumber == secondWinningNumber)
        println(
            "Congratulations! You won a prize\n" +
                    "Correct answer is $firstWinningNumber and $secondWinningNumber"
        )
    else if (firstNumber != firstWinningNumber && secondNumber != secondWinningNumber)
        println(
            "Failure.\n" +
                    "Correct answer is $firstWinningNumber and $secondWinningNumber"
        )
    else if (firstNumber != firstWinningNumber && secondNumber == secondWinningNumber ||
        secondNumber != secondWinningNumber && firstNumber == firstWinningNumber
    )
        println(
            "You won a consolation prize! \n" +
                    "Correct answer is $firstWinningNumber and $secondWinningNumber"
        )
}