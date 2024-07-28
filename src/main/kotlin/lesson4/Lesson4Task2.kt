package lesson4

fun main() {
    cargoCategory(inputWeight = 20, inputVolume = 80)
    cargoCategory(inputWeight = 50, inputVolume = 100)
}

const val AVERAGE_RANGE_FROM_KG = 35
const val AVERAGE_RANGE_TO_KG = 100
const val AVERAGE_RANGE_VOLUME_L = 100

fun cargoCategory(inputWeight: Int, inputVolume: Int) {
    println(
        "Cargo with weight $inputWeight kg and $inputVolume l " +
                "fits within the Average category: " +
                "${inputWeight > AVERAGE_RANGE_FROM_KG && inputWeight <= AVERAGE_RANGE_TO_KG && inputVolume < AVERAGE_RANGE_VOLUME_L}"
    )
}