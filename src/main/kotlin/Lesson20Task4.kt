fun main() {
    val listOfItems = listOf("Mascara", "Eye shadow", "Lipstick", "Face blush", "Sculptor", "Brushes")

    val stringToLambda: List<() -> Unit> = listOfItems.map { item: String ->
        {
            println("Element pressed: $item")
        }
    }

    for (i in stringToLambda.indices) {
        if (i % 2 != 0) {
            val lambda = stringToLambda.get(i)
            lambda()
        }
    }
}