fun main() {
    dataArchive()
}

fun dataArchive() {
    val firstName = "Татьяна"
    var lastName = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20

    println("Name: $firstName $lastName $patronymic age:$age")

    lastName = "Сидорова"
    age = 22

    println("Name: $lastName $lastName $patronymic age:$age")
}