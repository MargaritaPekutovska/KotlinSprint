abstract class User(val userName: String) {
    fun readForum() {
        println("$userName reading forum")
    }

    fun writeMessage(message: String) {
        println("$userName writing message: $message")
    }
}

class ForumUser(userName: String) : User(userName)

class ForumAdmin(userName: String) : User(userName) {
    fun deleteMessage(message: String) {
        println("$userName deletes messages: $message")
    }

    fun deleteUser(user: User) {
        println("$userName deletes: ${user.userName}")
    }
}

fun main() {
    val user1 = ForumUser("JemmesB")
    val admin = ForumAdmin("AdminLeo")

    user1.readForum()
    user1.writeMessage("Hello everyone!")

    admin.readForum()
    admin.deleteMessage("Deleting message.")
    admin.deleteUser(user1)
}