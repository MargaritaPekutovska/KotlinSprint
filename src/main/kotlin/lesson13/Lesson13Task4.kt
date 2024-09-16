package lesson13

class TelephoneDirectory4(
    var userName: String,
    var userPhoneNumber: Long,
    var companyName: String?,
) {
    init {
        println("New contact added:")
        printInfo()
    }

    fun printInfo() {
        println(
            "Contact information: name - $userName, \n" +
                    "phone number - $userPhoneNumber, \n" +
                    "employment status: ${companyName ?: "Not specified"}"
        )
    }

    companion object {
        fun printAllContacts(contacts: List<TelephoneDirectory4>) {
            println("All contacts in the phone book:")
            contacts.forEach { it.printInfo() }
        }
    }
}

fun main() {
    val telephoneDirectoryList = mutableListOf<TelephoneDirectory4>()

    while (true) {
        println("Input user name or press Enter to finish:")
        val userName = readlnOrNull() ?: break
        if (userName.isBlank()) break

        println("Input user phone number:")
        val userPhoneNumberInput = readlnOrNull()
        val userPhoneNumber = userPhoneNumberInput?.toLongOrNull()

        if (userPhoneNumber == null) {
            println("Invalid phone number.The information will not be added.")
            continue
        }

        println("Entry company name:")
        val companyName = readlnOrNull().takeIf { it?.isNotBlank() == true }

        telephoneDirectoryList.add(
            TelephoneDirectory4(
                userName = userName,
                userPhoneNumber = userPhoneNumber,
                companyName = companyName
            )
        )

        println("Information added.\n")
    }

    TelephoneDirectory4.printAllContacts(telephoneDirectoryList)
}
