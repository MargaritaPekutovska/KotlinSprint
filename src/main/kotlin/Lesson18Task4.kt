interface Box {
    fun calculateBoxSurfaceArea(width: Int = 0, length: Int = 0, height: Int = 0, edgeLength: Int = 0): Int
}

class RectangularBox : Box {
    override fun calculateBoxSurfaceArea(width: Int, length: Int, height: Int, edgeLength: Int): Int {
        val numFaces = 2
        return numFaces * (width * length + length * height + width * height)
    }
}

class CubicBox : Box {
    override fun calculateBoxSurfaceArea(width: Int, length: Int, height: Int, edgeLength: Int): Int {
        val numFaces = 6
        return numFaces * (edgeLength * edgeLength)
    }
}

fun main() {
    val rectangularBox = RectangularBox()
    val rectangularBoxSurfaceArea = rectangularBox.calculateBoxSurfaceArea(
        width = 4,
        length = 6,
        height = 4
    )
    println("Surface area of a rectangular box is $rectangularBoxSurfaceArea")

    val cubicBox = CubicBox()
    val cubicBoxSurfaceArea = cubicBox.calculateBoxSurfaceArea(
        edgeLength = 8
    )
    println("Surface area of a cubic box is $cubicBoxSurfaceArea")
}

