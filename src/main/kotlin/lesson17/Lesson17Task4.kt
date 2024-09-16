package lesson17

class Package(
    val numberPackage: Int,
    currentLocationOfPackage: String,
) {
    var movementCounter: Int = 0
        private set

    var currentLocationOfPackage: String = currentLocationOfPackage
        set(value) {
            field = value
            movementCounter++
            newLocation()
        }

    private fun newLocation() {
        println(
            "Parcel # $numberPackage is located $currentLocationOfPackage.\n" +
                    " Counter movement : $movementCounter"
        )
    }
}

fun main() {
    val package1 = Package(12, "Post office")

    package1.currentLocationOfPackage = "Custom control"
    package1.currentLocationOfPackage = "Distribution center"
    package1.currentLocationOfPackage = "Destination hub"
}