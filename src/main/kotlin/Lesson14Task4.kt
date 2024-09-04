open class CelestialBody(
    val nameOfCelestialBody: String,
    val atmosphere: String?,
    val suitableForLanding: Boolean = false,
)

class Satellite(
    nameOfCelestialBody: String,
    atmosphere: String? = null,
    suitableForLanding: Boolean = false
) : CelestialBody(nameOfCelestialBody, atmosphere, suitableForLanding)

class Planet(
    nameOfCelestialBody: String,
    atmosphere: String?,
    suitableForLanding: Boolean = false,
    val satellites: List<Satellite> = listOf()
) : CelestialBody(nameOfCelestialBody, atmosphere, suitableForLanding)

fun main() {
    val phobos = Satellite(nameOfCelestialBody = "Phobos", suitableForLanding = true)
    val deimos = Satellite(nameOfCelestialBody = "Deimos", suitableForLanding = true)
    val mars = Planet(
        nameOfCelestialBody = "Mars",
        atmosphere = "Thin CO2 atmosphere",
        suitableForLanding = true,
        satellites = listOf(phobos, deimos)
    )

    println("Planet: ${mars.nameOfCelestialBody}")
    println("Satellites:")
    for (satellite in mars.satellites) {
        println("- ${satellite.nameOfCelestialBody}")
    }
}
