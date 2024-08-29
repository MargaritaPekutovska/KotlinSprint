class TelephoneDirectory(
    val userName: String,
    val userPhoneNumber: Long,
    val companyName: String?,
)

fun main() {
    val telephoneDirectory = TelephoneDirectory(
        userName = "Peter Parker",
        userPhoneNumber = 17274454390,
        companyName = null
    )

    println(
        "Contact information: name - ${telephoneDirectory.userName}, " +
                "phone number - ${telephoneDirectory.userPhoneNumber}" +
                "employment status : ${telephoneDirectory.companyName ?: "Unemployed"}"
    )

}