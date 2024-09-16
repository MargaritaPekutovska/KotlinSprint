enum class Category(val nameOfItem: String) {
    CLOTHES(nameOfItem = "Clothes"),
    STATIONERY(nameOfItem = "Stationery"),
    OTHERS(nameOfItem = "Other items");

    fun getCategoryName(): String {
        return nameOfItem
    }
}

class Item(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun printInfo() {
        println("Item: $name ID: $id")
        println("Category: ${category.getCategoryName()}")
    }
}

fun main() {
    val item1 = Item("T-shirt", 156, Category.CLOTHES)
    val item2 = Item("Pencil", 220, Category.STATIONERY)
    val item3 = Item("Shelf", 301, Category.OTHERS)

    item1.printInfo()
    item2.printInfo()
    item3.printInfo()
}