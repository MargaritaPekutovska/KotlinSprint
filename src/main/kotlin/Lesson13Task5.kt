class AddressBookContact(
    var userName: String,
    var userPhoneNumber: Long = 0L,
    var companyName: String?,
) {

    fun getPhoneNumber() {
        println("Input your phone number:")
        val userInputNumber = readln()
        try {
            val formatedNumber = userInputNumber.toLong()
            userPhoneNumber = formatedNumber
        } catch (exception: NumberFormatException) {
            println("Exception has been caught $exception")
        }
    }
}

fun main() {
    AddressBookContact(
        userName = "Peter",
        companyName = "Amazon",
    ).getPhoneNumber()
}

