enum class Gender {
    MALE,
    FEMALE
}

data class Person(
    private val gender: Gender,
    private val name: String,
)

fun main() {
    val listOfPersons = arrayListOf<Person>()

    for (i in 1..5) {

        println("Input name of a person")
        val name = readln()

        println("Input gender of a person ${Gender.MALE} or ${Gender.FEMALE}")
        val genderString: String = readln().uppercase()

        val gender: Gender = Gender.valueOf(genderString)
        val person = Person(gender = gender, name = name)
        listOfPersons.add(person)
    }

    println(listOfPersons)
}