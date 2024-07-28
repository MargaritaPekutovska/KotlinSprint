package lesson4

fun main() {
    growthCriteriaForLegumes()
}

const val FAVORABLE_AIR_HUMIDITY = 20
const val SEASON_WINTER = "Winter"

fun growthCriteriaForLegumes() {
    val isSunnyWeather: Boolean = true
    val isOpenCanopy: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = SEASON_WINTER
    val conditionCheckResult = isFavourableCondition(
        isSunnyWeather,
        isOpenCanopy,
        airHumidity,
        currentSeason
    )
    println("Are the condition now favorable for growing legumes ? $conditionCheckResult")
}

fun isFavourableCondition(
    isSunnyWeather: Boolean,
    isOpenCanopy: Boolean,
    airHumidity: Int,
    currentSeason: String,
): Boolean {
    return isSunnyWeather == true && isOpenCanopy == true
            && airHumidity == FAVORABLE_AIR_HUMIDITY && currentSeason != SEASON_WINTER
}