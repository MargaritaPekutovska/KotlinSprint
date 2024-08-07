package lesson8

import java.util.*

fun main() {
    createYourOwnRecipe()
}

private fun createYourOwnRecipe() {
    println("Please write the quantity of ingredients:")

    val dataArray = Array(readln().toInt()) {
        println("Please write your ingredient:")
        readln()
    }
    println(Arrays.toString(dataArray))
}