class UserInfo(
    var userName: String,
    var userPassword: String,
    var userEmail: String,
) {

}

fun main() {
    val userInfo1 = UserInfo(
        userName = "Mandalorian09",
        userPassword = "33356Sp1",
        userEmail = "mandalorian.inspace@gmail.com"
    )

    val userInfo2 = UserInfo(
        userName = "Grogu01",
        userPassword = "786Oj90R",
        userEmail = "grogu.inspace@gmail.com"
    )

    println(userInfo1.userName)
    println(userInfo1.userPassword)
    println(userInfo1.userEmail)

    println(userInfo2.userName)
    println(userInfo2.userPassword)
    println(userInfo2.userEmail)
}