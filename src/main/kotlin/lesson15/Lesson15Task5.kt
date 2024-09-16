package lesson15

abstract class Car(
    val accommodatesPassenger: Int,
    val accommodatesCargo: Int?,
)

interface MachineProperties {
    fun getMaxPassengersNumber(): Int
    fun getMaxCargo(): Int

    fun loadingCargo(weight: Int) {
        if (weight <= getMaxCargo()) {
            println("Start loading cargo $weight tonne")
        } else {
            println("Max weight for loading 2 tonne")
        }
    }

    fun unloadCargo() {
        println("Start unloading cargo")
    }

    fun loadingPassengers(numberOfPassengers: Int) {
        if (numberOfPassengers <= getMaxPassengersNumber()) {
            println("Start loading passengers $numberOfPassengers")
        } else {
            println("Passengers cant be loaded, max number of passengers is ${getMaxPassengersNumber()}")
        }
    }

    fun dropOffPassengers() {
        println("Starts drop off passengers")
    }
}

class Truck : Car(accommodatesPassenger = 1, accommodatesCargo = 2), MachineProperties {
    override fun getMaxPassengersNumber(): Int {
        return accommodatesPassenger
    }

    override fun getMaxCargo(): Int {
        return accommodatesCargo ?: 0
    }
}

class PassengerCar : Car(accommodatesPassenger = 3, accommodatesCargo = null), MachineProperties {
    override fun getMaxPassengersNumber(): Int {
        return accommodatesPassenger
    }

    override fun getMaxCargo(): Int {
        return accommodatesCargo ?: 0
    }

    override fun loadingCargo(weight: Int) {
        println("Passenger car can not transport cargo")
    }

    override fun unloadCargo() {
        println("Passenger car can not transport cargo")
    }
}

fun main() {
    val truck = Truck()
    truck.loadingPassengers(1)
    truck.loadingCargo(2)
    truck.unloadCargo()
    truck.dropOffPassengers()

    val passengerCar = PassengerCar()
    passengerCar.loadingPassengers(2)
    passengerCar.dropOffPassengers()

    val passengerCar2 = PassengerCar()
    passengerCar2.loadingPassengers(3)
    passengerCar2.dropOffPassengers()
}

