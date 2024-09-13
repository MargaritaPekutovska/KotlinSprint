class OrderItem {
    private val orderNumber: Int
    private val listOfItems: List<String>
    private var item: String?

    constructor(orderNumber: Int, item: String) {
        this.orderNumber = orderNumber
        this.item = item
        listOfItems = emptyList()
    }

    constructor(orderId: Int, items: List<String>) {
        this.orderNumber = orderId
        listOfItems = items
        item = null
    }

    fun printOrderInfo() {
        if (listOfItems.isEmpty() && item != null) {
            println("Order №$orderNumber: ordered item : $item")
        } else if (listOfItems.isNotEmpty()) {
            println("Order №$orderNumber: The following items have been ordered: ${listOfItems.joinToString(", ")}")
        }
    }
}

fun main() {
    val order1 = OrderItem(1, "Guitar")
    val order2 = OrderItem(2, listOf("Drams", "Speaker", "Headphones"))

    order1.printOrderInfo()
    order2.printOrderInfo()
}