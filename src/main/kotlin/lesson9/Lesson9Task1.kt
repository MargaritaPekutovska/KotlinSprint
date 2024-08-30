package lesson9

fun main() {
    recipeApp()
}

private fun recipeApp() {
    val listOfIngredients = listOf(
        "salt", "chili pepper", "greenery", "lime", "coconut milk",
        "mushrooms", "garlic", "seafood"
    )

    println("The recipe contains the following ingredient:")
    for (ingredient in listOfIngredients)
        println(ingredient)
}