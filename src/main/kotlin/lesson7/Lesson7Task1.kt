package lesson7

fun main() {
    println("Generated password is ${generatePassword()}")
}

const val PASSWORD_LENGTH = 6

fun generatePassword(): String {
    val rangeLetters = ('a'..'z').toList()
    val rangeNumbers = ('0'..'9').toList()
    val passwordLength = PASSWORD_LENGTH
    val userPassword = StringBuilder(passwordLength)

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            userPassword.append(rangeLetters.random())
        } else {
            userPassword.append(rangeNumbers.random())
        }
    }
    return userPassword.toString()
}