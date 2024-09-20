open class Player(val name: String, var hasKey: Boolean)

fun main() {
    val player = Player(name = "Player1", hasKey = false)

    val checkDoor: (Player) -> String = { player: Player ->
        if (player.hasKey) {
            "${player.name} opened door!"
        } else {
            "Door is closed. ${player.name} has not key"
        }
    }

    println(checkDoor(player))

    player.hasKey = true
    println("${player.name} find key.")

    println(checkDoor(player))
}