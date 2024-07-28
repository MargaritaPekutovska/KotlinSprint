package lesson2

fun main() {
    mobileStrategy(20)
}

//fixed Conflicting declaration after Merge
private const val ONE_HUNDRED_PERCENT = 100

fun mobileStrategy(buffUnitBooster: Int) {
    val crystallineMaterial = 7
    val ironOre = 11

    val cristalBonus = (crystallineMaterial * buffUnitBooster) / ONE_HUNDRED_PERCENT
    println("Cristal line Material bonus ${cristalBonus}")

    val ironBonus = (ironOre * buffUnitBooster) / ONE_HUNDRED_PERCENT
    println("Iron ore bonus ${ironBonus}")
}