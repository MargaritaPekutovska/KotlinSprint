abstract class User(val userName: String) {
    fun readForum() {
        println("$userName reading forum")
    }

    fun writeMessage(message: String) {
        println("$userName writing message: $message")
    }

    abstract fun deleteMessage(message: String)
    abstract fun deleteUser(user: User)
}

class ForumUser(userName: String) : User(userName) {
    override fun deleteMessage(message: String) {
        println("User cannot delete messages")
    }

    override fun deleteUser(user: User) {
        println("User cannot delete other users")
    }
}

class ForumAdmin(userName: String) : User(userName) {
    override fun deleteMessage(message: String) {
        println("$userName deletes messages: $message")
    }

    override fun deleteUser(user: User) {
        println("$userName deletes: ${user.userName}")
    }
}

fun main() {
    val user1 = ForumUser("JemmesB")
    val admin = ForumAdmin("AdminLeo")

    user1.readForum()
    user1.writeMessage("Hello everyone!")
    user1.deleteMessage("Hello everyone!")

    admin.readForum()
    admin.writeMessage("Deleting message.")
    admin.deleteUser(user1)
}