import kotlin.random.Random

class Chat {

    val listOfMessages = arrayListOf<Message>()

    fun addMessage(authorOfMessage: String, textMessage: String) {
        listOfMessages.add(
            Message(id = Random.nextInt(), author = authorOfMessage, text = textMessage)
        )
    }

    fun addThreadMessage(parentMessageId: Int, text: String) {
        val parentMessage: Message? = listOfMessages.find { message: Message ->
            message.id == parentMessageId
        }
        if (parentMessage != null) {
            val threadMessage = ChildMessage(text = text, author = parentMessage.author)
            parentMessage.addMessage(threadMessage)
        }
    }

    fun printChat() {
        val groupedMessages = listOfMessages.groupBy { it.id }

        for (message: Message in listOfMessages) {
            println(" ${message.author}: ${message.text}")
            val threadMessage = message.threadMessage
            if (threadMessage != null) {
                println("\t${threadMessage.author}: ${threadMessage.text}")
            }
        }
    }
}

open class Message(val id: Int, val author: String, val text: String, var threadMessage: ChildMessage? = null) {
    fun addMessage(childMessage: ChildMessage) {
        threadMessage = childMessage
    }
}

class ChildMessage(val text: String, val author: String)

fun main() {
    val chat = Chat()

    chat.addMessage("Emy", "Hi everyone!")
    chat.addMessage("Melisa", "Hi Emy!")

    val firstMessageId = chat.listOfMessages[0].id

    chat.addThreadMessage(firstMessageId, "Welcome to the chat!")
    chat.printChat()
}