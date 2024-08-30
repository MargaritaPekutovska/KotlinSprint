class TelephoneDirectory2(
    val userName: String,
    val userPhoneNumber: Long,
    val companyName: String?,
) {
    fun printInfo() {
        println(
            "Contact information: name - $userName, \n" +
                    "phone number - $userPhoneNumber, \n" +
                    "employment status : ${companyName ?: "Not specified"} "
        )
    }
}

fun main() {
    val telephoneDirectory = TelephoneDirectory2(
        userName = "Peter Parker",
        userPhoneNumber = 17274454390,
        companyName = null
    )

    telephoneDirectory.printInfo()

}