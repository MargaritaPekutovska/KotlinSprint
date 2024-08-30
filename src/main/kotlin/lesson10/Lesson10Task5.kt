package lesson10

import java.util.Arrays

fun main() {
    shoppingCartApp()
}

private val shoppingCart: Array<String> = arrayOf("T-Shirt", "Shorts", "Cap")
private const val USER_NAME = "MargaritaP"
private const val USER_PASSWORD = "sRt669"
private const val TOKEN_LENGTH = 32

private fun shoppingCartApp() {
    val token: String? = authorizeUser()
    val cart = getShoppingCart(token)
    if (cart != null)
        println(Arrays.toString(cart))
    else println("Authorization not successful!")
}

private fun getShoppingCart(token: String?): Array<String>? {
    if (token == null) {
        return null
    } else {
        return shoppingCart
    }
}

private fun authorizeUser(): String? {
    println("Enter your login:")
    val userLogin = readln()

    println("Enter your password:")
    val userPassword = readln()

    if (userLogin == USER_NAME && userPassword == USER_PASSWORD) {
        return generateToken()
    } else {
        return null
    }

}

private fun generateToken(): String {
    val rangeLetters = ('a'..'z').toList()
    val rangeNumbers = ('0'..'9').toList()
    val tokenLength = TOKEN_LENGTH
    val generateToken = StringBuilder(tokenLength)

    for (i in 0 until tokenLength) {
        if (i % 2 == 0) {
            generateToken.append(rangeLetters.random())
        } else {
            generateToken.append(rangeNumbers.random())
        }
    }
    return generateToken.toString()
}