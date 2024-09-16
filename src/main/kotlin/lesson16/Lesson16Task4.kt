package lesson16

class Order(private val numberOfOrder: Int) {
    private var statusOfOrder: String = "Created"

    fun getStatus(): String {
        return statusOfOrder
    }

    private fun changeStatus(newStatus: String) {
        statusOfOrder = newStatus
    }

    fun submitChangeRequest(newStatus: String) {
        println("Request to change status # $numberOfOrder sent to manager")
        changeStatus(newStatus)
        println("Status of order # $numberOfOrder was changed: $statusOfOrder")
    }
}

fun main() {
    val order = Order(23600)
    println("Current order status :${order.getStatus()}")
    order.submitChangeRequest("In process")
    println("Updated Order status: ${order.getStatus()}")
}