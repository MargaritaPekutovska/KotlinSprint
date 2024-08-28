class Forum {

    private val participantList = ArrayList<ForumParticipant>()
    private val messageList = ArrayList<ForumMessage>()
    private var userIdCounter = 0

    fun createNewUser(userName: String): ForumParticipant {

        val newParticipant = ForumParticipant(userId = userIdCounter++.toString(), userName = userName)
        participantList.add(newParticipant)
        return newParticipant
    }

    fun createNewMessage(userId: String, message: String): ForumMessage? {
        for (i in 0 until participantList.size) {
            val currentParticipant = participantList.get(i)
            if (userId == currentParticipant.userId) {

                val newMessage =
                    ForumMessage(authorId = userId, message = message, userName = currentParticipant.userName)
                messageList.add(newMessage)
                return newMessage
            }
        }
        return null
    }

    fun printThread() {
        for (i in 0 until messageList.size) {
            val forumMessage = messageList.get(i)
            println("${forumMessage.userName} : ${forumMessage.message}")
        }
    }
}

class ForumParticipant(
    val userId: String,
    val userName: String,
)

class ForumMessage(
    val authorId: String,
    val message: String,
    val userName: String,
)

fun main() {
    val forum = Forum()
    val firstUser = forum.createNewUser("Hamster7")
    val secondUser = forum.createNewUser("Parrot88")

    forum.createNewMessage(userId = firstUser.userId, message = "Alright?!")
    forum.createNewMessage(userId = secondUser.userId, message = "Alright.")
    forum.createNewMessage(userId = firstUser.userId, message = "It's raining cats and dogs.")
    forum.createNewMessage(userId = secondUser.userId, message = "Popping in here. Cheers!")

    forum.printThread()
}