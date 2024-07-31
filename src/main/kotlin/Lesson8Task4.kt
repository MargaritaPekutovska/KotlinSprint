import java.util.*

fun main() {
    ingredients()
}

private fun ingredients() {
    val listOfIngredients = arrayOf(
        "salt", "chili pepper", "greenery", "lime", "coconut milk", "mushrooms", "garlic", "seafood"
    )
    println(Arrays.toString(listOfIngredients))

    println("Please write what ingredient you want to replace")
    val userIngredientsInfo = readln()

    val containsElements = userIngredientsInfo in listOfIngredients
    if (!containsElements) {
        println("This ingredient does not part of the recipe")
    } else {
        println("This ingredient is part of the recipe. What you want to replace it with?")
        val userIngredientToReplace = readln()
        val indexOfIngredient = listOfIngredients.indexOf(userIngredientsInfo)
        listOfIngredients[indexOfIngredient] = userIngredientToReplace
        println(Arrays.toString(listOfIngredients))
    }
}