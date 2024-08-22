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
    val digits = "0123456789"
    val specialChars = ((33..47) + (58..64) + (91..96) + (123..126)).map { it.toChar() }

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
