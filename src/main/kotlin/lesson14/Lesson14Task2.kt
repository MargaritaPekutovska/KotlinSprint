package lesson14

open class LinerShipType(
    val shipName: String = "Liner",
    val shipSpeed: Int = 200,
    val shipCapacity: Int? = 400,
) {
    override fun toString(): String {
        return "ship name:$shipName, ship speed:$shipSpeed, ship capacity:$shipCapacity"
    }

    open fun loadingMethod() {
        println("Liner Ship extend the horizontal ladder")
    }
}

class CargoShip1(private val deadWeightTonnage: Int = 10000) : LinerShipType(
    shipName = "Cargo",
    shipSpeed = 40,
    shipCapacity = 200
) {
    override fun toString(): String {
        return super.toString() + " dead weight tonnage:$deadWeightTonnage"
    }

    override fun loadingMethod() {
        println("Cargo ship activate loading crane")
    }
}

class IcebreakerShip1(private val shipFunctionality: String = "Breaks ice") : LinerShipType(
    shipName = "Icebreaker",
    shipSpeed = 30,
    shipCapacity = 150,
) {
    override fun toString(): String {
        return super.toString() + " ship functionality:$shipFunctionality"
    }

    override fun loadingMethod() {
        println("Icebreaker ship open the gate from the stern side")
    }
}

fun main() {
    val linerShip = LinerShipType()
    val cargoShip = CargoShip1()
    val icebreakerShip = IcebreakerShip1()

    linerShip.loadingMethod()
    cargoShip.loadingMethod()
    icebreakerShip.loadingMethod()
}