package lesson3

fun main() {
    multiplicationTableApp(inputNumber = 5)
}

fun multiplicationTableApp(inputNumber: Int) {
    var result = ""
    for (i in 1..9) {
        result += "$inputNumber x $i = ${inputNumber * i} \n"
    }
    println(result)
}