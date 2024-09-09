class User2 {
    private val userPassword: String = "123RE8"
    private val nameUser: String = "Dojo"

    fun validatePassword(passwordToValidate: String): Boolean {
        return passwordToValidate == userPassword
    }
}

fun main() {
    println("Please enter password for user Dojo")
    val passwordInput = readln()

    val dojoUser = User2()
    val validationResult = dojoUser.validatePassword(passwordInput)
    if (validationResult)
        println("Password is correct")
    else
        println("Wrong password")
}