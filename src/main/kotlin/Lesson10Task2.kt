fun main() {
    registerNewUser()
}

private const val MIN_DATA_LENGTH = 4

private fun registerNewUser() {
    println("Create your own user name:")
    val userName = readln()

    println("Create your own password:")
    val userPassword = readln()

    if (isDataValid(userName) && isDataValid(userPassword)) {
        println("Registration successful")
    } else
        println("Login or Password is too short")
}

private fun isDataValid(data: String): Boolean = data.length >= MIN_DATA_LENGTH