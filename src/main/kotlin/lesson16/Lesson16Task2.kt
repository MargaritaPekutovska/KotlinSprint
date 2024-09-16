package lesson16

class Circle2(private val radiusOfACircle: Double) {
    companion object {
        private const val PI = 3.14
        private const val TWO = 2
    }

    fun circumference(): Double {
        return TWO * PI * radiusOfACircle
    }

    fun areaOfACircle(): Double {
        return PI * radiusOfACircle * radiusOfACircle
    }
}

fun main() {
    val circle = Circle2(5.0)

    println("Circumference: ${circle.circumference()}")
    println("Area: ${circle.areaOfACircle()}")
}
