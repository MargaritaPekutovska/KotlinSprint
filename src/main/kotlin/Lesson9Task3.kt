fun main() {
    countingIngredientsForDishes()
}

const val EGGS = 2
const val MILK = 20
const val BUTTER = 15

private fun countingIngredientsForDishes() {

    val ingredientsForOneDish = mutableListOf(EGGS, MILK, BUTTER)
    println("Please indicate the number of dishes:")
    val portionNumber = readln().toInt()


    val quantityOfEggs = ingredientsForOneDish[0] * portionNumber
    val quantityOfMilk = ingredientsForOneDish[1] * portionNumber
    val quantityOfButter = ingredientsForOneDish[2] * portionNumber
    println(
        "For $portionNumber number of dishes you need : " +
                "$quantityOfEggs eggs, $quantityOfMilk l of milk, $quantityOfButter gm of butter"
    )
}