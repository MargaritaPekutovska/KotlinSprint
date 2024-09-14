class OrderItem {
    fun printOrderInfo(orderNumber: Int, item: String){
        println("Order №$orderNumber: ordered item : $item")
    }

    fun printOrderInfo(orderNumber: Int, item: List<String>){
        println("Order №$orderNumber: ordered item : $item")
    }
}

fun main() {
    val order = OrderItem()

    order.printOrderInfo(1,"Guitar")
    order.printOrderInfo(2, listOf("Drams","Speaker", "Headphones"))
}