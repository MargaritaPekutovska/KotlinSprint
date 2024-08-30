package lesson9

fun main() {
    recipeNew()
}

const val INPUT_QUANTITY = 5

fun recipeNew() {
    println("Please write your 5 ingredients:")

    val ingredients = mutableSetOf<String>()

    for (i in 0 until INPUT_QUANTITY) {
        ingredients.add(readln())
    }
    val sortedIngredients = ingredients.sorted().toMutableList()

    val firstIngredient = sortedIngredients[0].replaceFirstChar {
        it.uppercase()
    }
    sortedIngredients[0] = firstIngredient

    println(sortedIngredients)
}