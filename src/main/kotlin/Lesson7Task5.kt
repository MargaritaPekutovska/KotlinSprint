fun main() {
    createPassword()
}

const val MIN_PASSWORD_LENGTH = 6

fun createPassword() {
    var passwordLength: Int? = null

    while (passwordLength == null || passwordLength < MIN_PASSWORD_LENGTH) {
        println("Creating a new password:")
        val userPassword = readln()
        passwordLength = userPassword.toIntOrNull()

        if (passwordLength == null || passwordLength < MIN_PASSWORD_LENGTH) {
            println("Minimum password length - $MIN_PASSWORD_LENGTH symbols. Please try again.")
        }
    }

    val password = generatedPassword(passwordLength)
    println("New password is $password")
}

fun generatedPassword(length: Int): String {
    val digits = "0123456789"
    val lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz"
    val upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val allChars = digits + lowerCaseLetters + upperCaseLetters

    val password = StringBuilder()
    password.append(digits.random())
    password.append(lowerCaseLetters.random())
    password.append(upperCaseLetters.random())

    repeat(length - 3) {
        password.append(allChars.random())
    }

    return password.toString().toList().shuffled().joinToString("")
}