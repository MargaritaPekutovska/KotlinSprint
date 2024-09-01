open class LinerShip(
    val shipName: String = "Liner",
    val shipSpeed: Int = 200,
    val shipCapacity: Int? = 400,
) {
    override fun toString(): String {
        return "ship name:$shipName, ship speed:$shipSpeed, ship capacity:$shipCapacity"
    }
}

class CargoShip(private val deadWeightTonnage: Int = 10000) : LinerShip(
    shipName = "Cargo",
    shipSpeed = 40,
    shipCapacity = 200
) {
    override fun toString(): String {
        return super.toString() + " dead weight tonnage:$deadWeightTonnage"
    }
}

class IcebreakerShip(private val shipFunctionality: String = "Breaks ice") : LinerShip(
    shipName = "Icebreaker",
    shipSpeed = 30,
    shipCapacity = 150,
) {
    override fun toString(): String {
        return super.toString() + " ship functionality:$shipFunctionality"
    }
}

fun main() {
    val linerShip = LinerShip()
    val cargoShip = CargoShip()
    val icebreakerShip = IcebreakerShip()

    println(
        "Ship Liner properties: $linerShip,\n" +
                "Ship Cargo properties: $cargoShip,\n" +
                "Ship Icebreaker properties: $icebreakerShip"
    )
}