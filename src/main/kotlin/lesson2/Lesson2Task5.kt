package lesson2

fun main() {
    bankCalculatorApp()
}

//fixed Conflicting declaration after Merge
private const val ONE_HUNDRED_PERCENT = 100

fun bankCalculatorApp() {
    val interestRate = 16.7
    val depositSum = 70_000
    val years = 20

    val futureAmount = depositSum * Math.pow(
        1 + (interestRate / ONE_HUNDRED_PERCENT), years.toDouble()
    )
    println("Future Amount after $years years: %.2f".format(futureAmount))
}