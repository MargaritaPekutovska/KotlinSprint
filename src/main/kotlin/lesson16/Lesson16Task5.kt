package lesson16

class Player(
    private var playerHealth: Int = 100,
    private val playerName: String = "Player1",
    private var attackPower: Int = 30,
) {
    fun takeDamage(damage: Int) {
        if (isAlive()) {
            playerHealth -= damage
            println("Took damage $damage, hp left $playerHealth")
            if (!isAlive()) {
                death()
            }
        } else {
            println("Player cannot take damage,he is dead.")
        }
    }

    fun heal(healingPoints: Int) {
        if (isAlive()) {
            playerHealth += healingPoints
            println("Health after healing $playerHealth")
        } else {
            println("Player cannot be healed,he is dead.")
        }
    }

    private fun death() {
        println("Player passed away")
        attackPower = 0
        playerHealth = 0
    }

    private fun isAlive(): Boolean = playerHealth > 0
}

fun main() {
    val player = Player()

    player.takeDamage(30)
    player.heal(30)
    player.takeDamage(35)
    player.takeDamage(35)
    player.takeDamage(40)

    player.heal(30)
}