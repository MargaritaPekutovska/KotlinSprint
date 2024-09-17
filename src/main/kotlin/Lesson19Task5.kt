enum class Gender {
    MALE,
    FEMALE
}

data class Person(
    private val gender: Gender,
    private val name: String,
)

private const val INPUT_MASCULINE_GENDER = "m"
private const val INPUT_FEMININE_GENDER = "f"

fun main() {
    val listOfPersons = arrayListOf<Person>()

    for (i in 1..5) {

        println("Input name of a person")
        val name = readln()

        println("Input gender of a person in a format of f or m")
        val genderString: String = readln()

        var gender: Gender
        if (genderString == INPUT_MASCULINE_GENDER) {
            gender = Gender.MALE
        } else if (genderString == INPUT_FEMININE_GENDER) {
            gender = Gender.FEMALE
        } else {
            throw IllegalArgumentException("Gender string should be f or m.")
        }
        val person = Person(gender = gender, name = name)
        listOfPersons.add(person)
    }

    println(listOfPersons)
}