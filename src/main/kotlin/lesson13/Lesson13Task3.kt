package lesson13

class TelephoneDirectory3(
    var userName: String,
    var userPhoneNumber: Long,
    var companyName: String?,
)

fun main() {
    val telephoneDirectoryList = listOf(
        TelephoneDirectory3(
            userName = "Peter Parker",
            userPhoneNumber = 17274454390,
            companyName = null
        ),
        TelephoneDirectory3(
            userName = "Tony Stark",
            userPhoneNumber = 15893048567,
            companyName = "Stark Industries"
        ),
        TelephoneDirectory3(
            userName = "Bruce Wayne",
            userPhoneNumber = 12345678901,
            companyName = "Wayne Enterprises"
        ),
        TelephoneDirectory3(
            userName = "Clark Kent",
            userPhoneNumber = 10987654321,
            companyName = null
        ),
        TelephoneDirectory3(
            userName = "Diana Prince",
            userPhoneNumber = 11223344556,
            companyName = "null"
        )
    )

    val companies = telephoneDirectoryList
        .mapNotNull { it.companyName }

    println("Information about companies in telephone directory:")
    companies.forEach { println(it) }
}