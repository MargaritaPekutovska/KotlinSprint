class User2(
    private val userPassword: String,
    private val nameUser: String,
) {

    fun validatePassword(passwordToValidate: String): Boolean {
        return passwordToValidate == userPassword
    }
}

fun main() {
    println("Please enter password for user Dojo")
    val passwordInput = readln()

    val dojoUser = User2("123RE8", "Dojo")
    val validationResult = dojoUser.validatePassword(passwordInput)
    if (validationResult)
        println("Password is correct")
    else
        println("Wrong password")
}