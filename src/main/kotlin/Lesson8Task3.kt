fun main() {
    recipesApp2()
}

fun recipesApp2() {
    val arrayOfIngredients: Array<String> = arrayOf(
        "salt", "chili pepper", "greenery", "lime", "coconut milk", "mushrooms", "garlic", "seafood"
    )
    println("Please write your own ingredient:")
    val userIngredient: String = readln()

    if (userIngredient in arrayOfIngredients) {
        println("The recipe contains $userIngredient")
    } else {
        println("The recipe dosen't contain $userIngredient")
    }
}