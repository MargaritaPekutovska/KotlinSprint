abstract class Shape {
    abstract fun getShapeName(): String

    fun draw(x: Int, y: Int) {
        println("Drawing a ${getShapeName()} with coordinates $x, $y")
    }

    fun draw(x: Float, y: Float) {
        println("Drawing a ${getShapeName()} with coordinates $x, $y")
    }
}

class DotShape : Shape() {
    override fun getShapeName(): String {
        return "dot"
    }
}

class CircleShape : Shape() {
    override fun getShapeName(): String {
        return "circle"
    }
}

class SquareShape : Shape() {
    override fun getShapeName(): String {
        return "square"
    }
}

class Screen {
    fun drawShape(shape: Shape, x: Int, y: Int) {
        shape.draw(x, y)
    }

    fun drawShape(shape: Shape, x: Float, y: Float) {
        shape.draw(x, y)
    }
}

fun main() {
    val screen = Screen()
    screen.drawShape(shape = DotShape(), x = 256, y = 180)
    screen.drawShape(shape = CircleShape(), x = 510.8f, y = 344.2f)
    screen.drawShape(shape = SquareShape(), x = 120, y = 250)
}