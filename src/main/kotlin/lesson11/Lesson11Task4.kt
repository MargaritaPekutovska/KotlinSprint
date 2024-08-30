package lesson11

data class Category(
    val image: String,
    val name: String,
    val categoryDescription: String,
    val allRecipe: List<Recipe>,
)

data class Recipe(
    val recipeName: String,
    val servingsNumber: Int,
    val listOfIngredients: List<Ingredient>,
    val preparationMethod: String,
)

data class Ingredient(
    val nameOfIngredient: String,
    val quantity: String,
)

fun main(){
    val burgerRecipe= Recipe(
        recipeName = "Burger with mushrooms and cheese",
        servingsNumber = 2,
        listOfIngredients = listOf(
            Ingredient("Beef", "1lb"),
            Ingredient("Cheddar cheese","4 slices"),
            Ingredient("Burger Buns","2"),
            Ingredient("Mushrooms", "300g")
        ),
        preparationMethod = "Sauté mushrooms and onions, cook cheese-topped patties, and assemble with buns and toppings."
    )
    val categoryOfRecipe= Category(
        image = "https://burgermeister.com/wp-content/uploads/2021/11/Best-Burger-In-Berlin-Germany-Burgermeister.jpg",
        name = "Burgers",
        categoryDescription = "Recipes for all popular types of burgers",
        allRecipe = listOf(burgerRecipe)
    )

    println(burgerRecipe.recipeName)
    println(burgerRecipe.servingsNumber)
    println(burgerRecipe.listOfIngredients)
    println(burgerRecipe.preparationMethod)

    println(categoryOfRecipe.image)
    println(categoryOfRecipe.name)
    println(categoryOfRecipe.categoryDescription)
    println(categoryOfRecipe.allRecipe)
}