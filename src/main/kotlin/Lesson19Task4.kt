enum class TankAmmunition(val impactForce: Int) {
    BLUE_AMMO(5),
    GREEN_AMMO(10),
    RED_AMMO(20);
}

class Tank {
    private var currentAmmo: TankAmmunition? = null

    fun reloadAmmunition(ammunition: TankAmmunition) {
        currentAmmo = ammunition
        println("Tank loaded with ${ammunition.name}!")
    }

    fun shoot() {
        if (currentAmmo != null) {
            println("Tank fired! Demage dealt: ${currentAmmo!!.impactForce} units.")
        } else {
            println("Tank is not loaded with any ammo!")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()

    tank.reloadAmmunition(TankAmmunition.BLUE_AMMO)
    tank.shoot()

    tank.reloadAmmunition(TankAmmunition.RED_AMMO)
    tank.shoot()

    tank.reloadAmmunition(TankAmmunition.GREEN_AMMO)
    tank.shoot()

}

