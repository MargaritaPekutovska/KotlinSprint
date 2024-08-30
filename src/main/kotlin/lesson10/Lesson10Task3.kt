package lesson10

fun main() {
    createPassword()
}

private fun createPassword() {
    println("Please specify the password length:")
    val passwordLength = readln().toInt()
    val generatedPassword = generatePassword(passwordLength)
    println("Generated Password: $generatedPassword")
}

private fun generatePassword(passwordLength: Int): String {
    val digits = 0..9
    val specialChars = ' '..'/'

    val password = StringBuilder()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password.append(digits.random())
        } else {
            password.append(specialChars.random())
        }
    }
    return password.toString()
}
