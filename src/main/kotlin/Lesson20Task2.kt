open class Player(val name: String, var currentHealth: Int?, val maxHealth: Int)

fun main() {
    val player1 = Player(
        name = "Player1",
        currentHealth = 50,
        maxHealth = 100
    )
    println("Health before treatment: ${player1.currentHealth}/${player1.maxHealth}")

    val healingPotion: (Player) -> Player = { player: Player ->
        player.currentHealth = player.maxHealth
        player
    }

    healingPotion(player1)

    println("After treatment: ${player1.name} recovered till ${player1.currentHealth}/${player1.maxHealth}")
}