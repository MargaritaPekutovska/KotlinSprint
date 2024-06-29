fun main() {
    ageVerification(2005)
}

const val AGE_OF_MAJORITY = 18

fun ageVerification(userAge: Int) {
    val currentYear: Int = 2024
    val yearOfMajority = currentYear - AGE_OF_MAJORITY

    if (userAge >= yearOfMajority)
        println("Show hidden content")
    else if (userAge == 2004 || userAge == 2005)
        println("Show limited content")
    else
        println("Return to home page")
}