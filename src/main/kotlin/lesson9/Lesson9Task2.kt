package lesson9

fun main() {
    newIngredientList()
}

private fun newIngredientList() {
    val ingredientList = mutableListOf("Raspberry", "Coconut", "Mango")
    println("The recipe contains basic ingredients: $ingredientList")

    println("Would you like to add your own ingredient?")
    val userResponse = readln()
    if (!userResponse.equals("Yes", ignoreCase = true)) return

    println("Which ingredient do you want to add?")
    ingredientList.add(readln())
    println(ingredientList)
}