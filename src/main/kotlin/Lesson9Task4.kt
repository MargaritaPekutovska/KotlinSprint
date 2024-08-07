fun main() {
    userInfo()
}

fun userInfo() {
    println("Please write 5 ingredients separated by a coma:")

    val fiveIngredients = readln().split(",").map { it.trim() }
    fiveIngredients.sorted()

    println(fiveIngredients.joinToString(", "))
}