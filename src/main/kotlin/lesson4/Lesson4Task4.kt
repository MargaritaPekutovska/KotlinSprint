package lesson4

fun main() {
    trainingProgram(dayOfTraining = 5)
}

fun trainingProgram(dayOfTraining: Int) {
    val isAbsArmsWorkout = dayOfTraining % 2 != 0
    val isLegsBackWorkout = !isAbsArmsWorkout

    determineWorkoutType(isAbsArmsWorkout = isAbsArmsWorkout, isLegsBackWorkout = isLegsBackWorkout)
}

fun determineWorkoutType(isAbsArmsWorkout: Boolean, isLegsBackWorkout: Boolean) {
    println(
        """
     Arms workout : $isAbsArmsWorkout
     Legs workout : $isLegsBackWorkout
     Back workout : $isLegsBackWorkout
     Abs workout : $isAbsArmsWorkout
    """.trimIndent()
    )
}