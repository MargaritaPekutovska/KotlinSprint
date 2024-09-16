package lesson18

open class Box {
    open fun calculateBoxSurfaceArea(): Int {
        return 0
    }
}

class RectangularBox(private val width: Int, private val length: Int, private val height: Int) : Box() {
    override fun calculateBoxSurfaceArea(): Int {
        val numFaces = 2
        return numFaces * (width * length + length * height + width * height)
    }
}

class CubicBox(private val edgeLength: Int) : Box() {
    override fun calculateBoxSurfaceArea(): Int {
        val numFaces = 6
        return numFaces * (edgeLength * edgeLength)
    }
}

fun main() {
    val rectangularBox = RectangularBox(4, 6, 4)
    val rectangularBoxSurfaceArea = rectangularBox.calculateBoxSurfaceArea()
    println("Surface area of a rectangular box is $rectangularBoxSurfaceArea")

    val cubicBox = CubicBox(8)
    val cubicBoxSurfaceArea = cubicBox.calculateBoxSurfaceArea()
    println("Surface area of a cubic box is $cubicBoxSurfaceArea")
}

