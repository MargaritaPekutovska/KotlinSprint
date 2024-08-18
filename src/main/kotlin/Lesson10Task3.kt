import kotlin.random.Random

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
    val specialChars = """!"#$%&'()*+,-./"""

    val password = StringBuilder()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password.append(digits[Random.nextInt(digits.length)])
        } else {
            password.append(specialChars[Random.nextInt(specialChars.length)])
        }
    }
    return password.toString()
}
