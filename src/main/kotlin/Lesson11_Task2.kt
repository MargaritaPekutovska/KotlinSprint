class User2(
    val userName: String,
    var userPassword: String,
    val userEmail: String,
    var userBio: String? = null,
) {

    fun printUserInfo() {
        println("User Information:")
        println("Name: $userName")
        println("Email: $userEmail")
        println("Bio: ${userBio ?: "No bio available"}")
    }

    fun updateBio() {
        println("Enter your new bio:")
        userBio = readln()
    }

    fun changePassword() {
        println("Enter your current password:")
        val currentPassword = readln()

        if (currentPassword == userPassword) {
            println("Enter your new password:")
            val newPassword = readln()
            userPassword = newPassword
            println("Password changed successfully.")
        } else {
            println("Incorrect current password.")
        }
    }
}

fun main() {
    val user = User2(
        userName = "BobaFett32",
        userPassword = "11Bm65",
        userEmail = "bobaFett03@gmail.com",
    )

    println(
        """
        Initial user info:
        ${user.printUserInfo()}
        
        Update bio:
        ${user.updateBio()}
        
        Change password:
        ${user.changePassword()}
        
        Updated user info:
        ${user.printUserInfo()}
        """.trimIndent()
    )
}


