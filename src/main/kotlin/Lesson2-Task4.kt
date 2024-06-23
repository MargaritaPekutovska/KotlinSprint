fun main() {
    mobileStrategy()
}

fun mobileStrategy() {
    val crystallineMaterial = 7
    val ironOre = 11
    val buffUnitBooster = 0.20f

    val cristalBonus = crystallineMaterial * buffUnitBooster
    println("Cristal line Material bonus ${cristalBonus}")

    val ironBonus = ironOre * buffUnitBooster
    println("Iron ore bonus ${ironBonus}")
}