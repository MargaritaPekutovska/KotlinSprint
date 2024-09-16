package lesson18

abstract class Animal(private val name: String) {
    fun sleep() {
        println("$name -> sleeps")
    }
    abstract fun eat()
}

class Fox(private val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eats berries")
    }
}

class Dog(private val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eats bones")
    }
}

class Cat(private val name: String) : Animal(name) {
    override fun eat() {
        println("$name -> eats fish")
    }
}

fun main() {
    val listOfAnimals = arrayListOf<Animal>(
        Fox("Lucky"),
        Dog("Rex"),
        Cat("Richi")
    )
    listOfAnimals.forEach {
        it.eat()
        it.sleep()
    }
}