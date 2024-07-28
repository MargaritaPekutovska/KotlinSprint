package lesson4

fun main() {
    scientificShip(isDamaged = false, crewHeadcount = 70, cratesNumber = 50, isWeatherFavourable = true)
}

const val MINIMUM_RECOMMENDED_CREW_SIZE = 55
const val RECOMMENDED_CREW_SIZE = 70
const val RECOMMENDED_CRATES_NUMBER = 50

fun scientificShip(
    isDamaged: Boolean,
    crewHeadcount: Int,
    cratesNumber: Int,
    isWeatherFavourable: Boolean,
) {
    val alternativeSailingPrerequisites: Boolean = crewHeadcount == RECOMMENDED_CREW_SIZE
            && isWeatherFavourable == true &&
            cratesNumber >= RECOMMENDED_CRATES_NUMBER

    val sailingsPrerequisites: Boolean = !isDamaged && cratesNumber > RECOMMENDED_CRATES_NUMBER &&
            crewHeadcount >= MINIMUM_RECOMMENDED_CREW_SIZE && crewHeadcount <= RECOMMENDED_CREW_SIZE

    val shipCanSail: Boolean = sailingsPrerequisites || alternativeSailingPrerequisites
    println("Ship can sail $shipCanSail")
}