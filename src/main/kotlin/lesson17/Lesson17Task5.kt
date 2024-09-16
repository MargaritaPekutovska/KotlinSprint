package lesson17

private class User1(
    private var userPassword: String,
    private var userLogin: String,
) {
    var password: String
        set(value) {
            println("You can't change password")
        }
        get():String {
            val length = userPassword.length
            return "*".repeat(length)
        }

    var login: String = userLogin
        set(value) {
            println("Your login has been changed to $value")
            field = value
        }
}

fun main() {
    val user1 = User1("Gk9054_I", "Jolly1")

    user1.password = "Jo-Jo"
    println(user1.password)
    user1.login = "JollyB2"
}