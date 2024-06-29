fun main() {
    lotteryApp(firstNumber = 2, secondNumber = 21)
}

const val NUMBER_FROM = 0
const val NUMBER_TO = 42
const val FIRST_WINNING_NUMBER = 3
const val SECOND_WINNING_NUMBER = 21

fun lotteryApp(firstNumber: Int, secondNumber: Int) {
    println("Select number from $NUMBER_FROM to $NUMBER_TO")

    if (firstNumber == FIRST_WINNING_NUMBER && secondNumber == SECOND_WINNING_NUMBER)
        println(
            "Congratulations! You won a prize\n" +
                    "Correct answer is $FIRST_WINNING_NUMBER and $SECOND_WINNING_NUMBER"
        )
    else if (firstNumber != FIRST_WINNING_NUMBER && secondNumber != SECOND_WINNING_NUMBER)
        println(
            "Failure.\n" +
                    "Correct answer is $FIRST_WINNING_NUMBER and $SECOND_WINNING_NUMBER"
        )
    else if (firstNumber != FIRST_WINNING_NUMBER && secondNumber == SECOND_WINNING_NUMBER)
        println(
            "You won a consolation prize! \n" +
                    "Correct answer is $FIRST_WINNING_NUMBER and $SECOND_WINNING_NUMBER"
        )
    else if (firstNumber == FIRST_WINNING_NUMBER && secondNumber != SECOND_WINNING_NUMBER)
        println(
            "You won a consolation prize! \n" +
                    "Correct answer is $FIRST_WINNING_NUMBER and $SECOND_WINNING_NUMBER")
}