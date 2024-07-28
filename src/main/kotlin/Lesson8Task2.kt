fun main() {
    recipesApp()
}

fun recipesApp() {
    val arrayOfIngredients = arrayOf(
        "salt", "chili pepper", "greenery", "lime", "coconut milk", "mushrooms", "garlic", "seafood"
    )
    println("Please write your own ingredient:")
    val userIngredient = readln()

    for (ingredient in arrayOfIngredients) {
        if (userIngredient == ingredient) {
            println("The recipe contains $ingredient")
            break
        }
        if (arrayOfIngredients.indexOf(ingredient) == arrayOfIngredients.size - 1) {
            println("The recipe doesn`t contain the ingredient $userIngredient")
        }
    }
}