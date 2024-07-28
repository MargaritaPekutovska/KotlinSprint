package lesson3

fun main() {
    chessApp2(moveInfo = "D2-D4;0")
}

fun chessApp2(moveInfo: String) {
    val parts = moveInfo.split("-", ";")

    if (parts.size >= 3) {
        val moveFrom = parts[0]
        val moveTo = parts[1]
        val numberOfMove = parts[2]

        println(
            " Move from $moveFrom \n Moved to $moveTo \n Move number $numberOfMove "
        )
    }
}