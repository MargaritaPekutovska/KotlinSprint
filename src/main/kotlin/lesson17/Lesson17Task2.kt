package lesson17

class Ship(
    name: String,
    averageSpeed: Int,
    homePort: String,
) {

    var name: String = name
        set(value) {
            println("You can't change this name.")
        }
}

fun main() {
    val ship = Ship(
        name = "Veronica",
        averageSpeed = 80,
        homePort = "Ningbo-Zhoushan"
    )
    ship.name = "New name"
}