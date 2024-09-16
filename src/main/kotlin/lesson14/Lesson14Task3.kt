package lesson14

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius.pow(2.0)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Rectangle("white", 4.0, 6.0),
        Circle("white", 7.0),
        Rectangle("black", 2.0, 3.0)
    )

    val blackPerimeterSum = figures.filter { it.color == "black" }
        .sumOf { it.calculatePerimeter() }
        .let { round(it * 100) / 100 }

    val whiteAreaSum = figures.filter { it.color == "white" }
        .sumOf { it.calculateArea() }
        .let { round(it * 100) / 100 }

    println("Sum of all black figure: $blackPerimeterSum")
    println("Sum of all white figure: $whiteAreaSum")
}