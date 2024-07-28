package lesson5

fun main() {
    ageVerification(2005)
}

const val AGE_OF_MAJORITY = 18

fun ageVerification(userAge: Int) {
    val currentYear: Int = 2024
    val yearOfMajority = currentYear - AGE_OF_MAJORITY

    if (userAge >= yearOfMajority)
        println("Show hidden content")
}