package lesson5

fun main() {
    loginDataVerification(userName = "Zaphod", password = "PanGalactic")
}

const val SAVED_USER_NAME = "Zaphod"
const val SAVED_USER_PASSWORD = "PanGalactic"

fun loginDataVerification(userName: String, password: String) {

    val robotGreeting = """
       |Attention, passenger.
       |My task, unenviable as usual, is to welcome you aboard the Heart of Gold. 
       |[sigh...] Well, please enter your username so we can begin the login process. 
       |I'm always ready to serve, even though it doesn't bring me joy... 
       |but you probably don't care about that. 
       |[sighs even deeper...] Yes, go ahead, please enter your details...
       """.trimMargin()
    println(robotGreeting)

    println("Enter your name")


    if (userName != SAVED_USER_NAME) {
        println("Username not found. Complete user registration")
        return
    }

    println("Enter your password")

    if (password == SAVED_USER_PASSWORD) {
        val robotGreeting2 = """
        |sighs...,
        |Your data has been verified, and lo and behold, it's correct...
        |User "$userName", you are allowed to board the ship "Heart of Gold"
        |Although I don’t care... Well, go ahead, come in... If you really need it, in the end... 
        |[melancholy sigh...]
        |I hope you enjoy your stay here more than I did.
        """.trimMargin()

        println("$robotGreeting2")
    } else {
        println("Wrong password")
    }
}