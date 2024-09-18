fun main() {
    val greetings: (String) -> String = { userName: String ->
        "Happy New Year, $userName!"
    }
    println("Input your name:")
    val userName = readln()

    val greetingMessage = greetings(userName)

    println(greetingMessage)
}