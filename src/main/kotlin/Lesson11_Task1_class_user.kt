class UserInfo(
    val userName: String,
    val userPassword: String,
    val userId: String,
    val userEmail: String,
)

fun main() {
    val userInfo1 = UserInfo(
        userName = "Mandalorian09",
        userPassword = "33356Sp1",
        userId = "a2w45",
        userEmail = "mandalorian.inspace@gmail.com"
    )

    val userInfo2 = UserInfo(
        userName = "Grogu01",
        userPassword = "786Oj90R",
        userId = "fdjkYYt45",
        userEmail = "grogu.inspace@gmail.com"
    )

    println(userInfo1.userName)
    println(userInfo1.userPassword)
    println(userInfo1.userId)
    println(userInfo1.userEmail)

    println(userInfo2.userName)
    println(userInfo2.userPassword)
    println(userInfo1.userId)
    println(userInfo2.userEmail)
}