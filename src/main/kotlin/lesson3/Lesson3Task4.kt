package lesson3

fun main() {
    chessApp()
}

fun chessApp() {
    var cellNamber = 2
    var moveFrom = "E$cellNamber"
    cellNamber = 4
    var movedTo = "E$cellNamber"
    var numberOfMove = 1
    println("Black figure moved from $moveFrom to $movedTo, $numberOfMove")

    cellNamber = 2
    moveFrom = "D$cellNamber"
    cellNamber = cellNamber + 1
    movedTo = "D$cellNamber"
    println("White figure moved from $moveFrom to $movedTo, $numberOfMove")

}