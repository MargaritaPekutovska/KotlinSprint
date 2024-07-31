import java.util.*

fun main() {
    createYourOwnRecipe()
}

private fun createYourOwnRecipe() {
    println("Please write the quantity of ingredients:")
    val arraySize = readln().toInt()

    val dataArray = arrayOfNulls<String>(arraySize)

    for (i in 0 until arraySize) {
        println("Please write your ingredient:")
        dataArray[i] = readln()
    }
    println(Arrays.toString(dataArray))
}