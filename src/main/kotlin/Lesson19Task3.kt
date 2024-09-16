enum class Characteristics {
    TAKE_OFF {
        override fun spaceshipCharacteristics(): String {
            throw NotImplementedError("Not yet implemented for TAKE_OFF")
        }
    },
    LANDING {
        override fun spaceshipCharacteristics(): String {
            TODO("Not yet implemented")
        }
    },
    SHOOTING_AT_AN_ASTEROID {
        override fun spaceshipCharacteristics(): String {
            TODO("Additional logic required for SHOOTING_AT_AN_ASTEROID")
            //Need information about additional logic
        }
    };

    abstract fun spaceshipCharacteristics(): String
}
