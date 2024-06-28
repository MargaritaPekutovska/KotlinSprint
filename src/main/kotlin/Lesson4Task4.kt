fun main() {
    trainingProgram()
}

data class Workout(val isAbsArmsWorkout: Boolean, val isLegsBackWorkout: Boolean)

fun trainingProgram() {
    val firstDay = Workout(isAbsArmsWorkout = true, isLegsBackWorkout = false)
    val secondDay = Workout(isAbsArmsWorkout = false, isLegsBackWorkout = true)
    val thirdDay = Workout(isAbsArmsWorkout = true, isLegsBackWorkout = false)
    val fourthDay = Workout(isAbsArmsWorkout = false, isLegsBackWorkout = true)
    val fifthDay = Workout(isAbsArmsWorkout = true, isLegsBackWorkout = false)

    determineWorkoutType(isAbsArmsWorkout = fifthDay.isAbsArmsWorkout, isLegsBackWorkout = fifthDay.isLegsBackWorkout)
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

