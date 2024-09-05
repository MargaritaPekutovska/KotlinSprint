interface Flyable {
    fun fly(): String
}

interface Swimmable {
    fun swim(): String
}

abstract class Creature {
    abstract fun move(): String
}

class Carp : Creature(), Swimmable {
    override fun swim(): String {
        return "Carp swims in water"
    }

    override fun move(): String {
        return swim()
    }
}

class Seagull : Creature(), Flyable, Swimmable {
    override fun fly(): String {
        return "Seagull flies in the sky"
    }

    override fun swim(): String {
        return "Seagull floats on the surface of the water "
    }

    override fun move(): String {
        return "${fly()} and ${swim()}"
    }
}

class Duck : Creature(), Flyable, Swimmable {

    override fun fly(): String {
        return "Duck is flying in the sky"
    }

    override fun swim(): String {
        return "Duck is swimming on the water"
    }

    override fun move(): String {
        return "${fly()} and ${swim()}"
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println(carp.move())
    println(seagull.move())
    println(duck.move())
}