package lesson2

fun main() {
    englishClass()
}

fun englishClass() {
    val gradeStudent1 = 3f
    val gradeStudent2 = 4f
    val gradeStudent3 = 3f
    val gradeStudent4 = 5f
    val numberOfStudents = 4

    val sum = (
            gradeStudent1 + gradeStudent2 + gradeStudent3 + gradeStudent4
            ) / numberOfStudents
    println("GPA= $sum")
}