interface OrderItem {
    val orderNumber: Int
    fun printOrderInfo()
}

class SingleItemOrder(override val orderNumber: Int, private val item: String) : OrderItem {
    override fun printOrderInfo() {
        println("Order №$orderNumber: ordered item : $item")
    }
}

class MultipleItemsOrder(override val orderNumber: Int, private val items: List<String>) : OrderItem {
    override fun printOrderInfo() {
        println("Order №$orderNumber: The following items have been ordered: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1: OrderItem = SingleItemOrder(1, "Guitar")
    val order2: OrderItem = MultipleItemsOrder(2, listOf("Drams", "Speaker", "Headphones"))

    order1.printOrderInfo()
    order2.printOrderInfo()
}