fun main() {
    registrationInApp()
}

fun registrationInApp() {
    println("Create your user name")
    val createdUserNane = readln()

    println("Create personal password")
    val createdPassword = readln()

    do {
        println("To login enter your created user name and password")
        val userNameInput = readln()
        val passwordInput = readln()
    } while (userNameInput != createdUserNane && passwordInput != createdPassword)

    println("You have successfully logged in")
}