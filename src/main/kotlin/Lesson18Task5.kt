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
    fun drawDot(shape: DotShape, x: Int, y: Int) {
        shape.draw(x, y)
    }

    fun drawDot(shape: DotShape, x: Float, y: Float) {
        shape.draw(x, y)
    }

    fun drawCircle(shape: CircleShape, x: Int, y: Int) {
        shape.draw(x, y)
    }

    fun drawCircle(shape: CircleShape, x: Float, y: Float) {
        shape.draw(x, y)
    }

    fun drawSquare(shape: SquareShape, x: Int, y: Int) {
        shape.draw(x, y)
    }

    fun drawSquare(shape: SquareShape, x: Float, y: Float) {
        shape.draw(x, y)
    }
}

fun main() {
    val screen = Screen()
    screen.drawDot(shape = DotShape(), x = 256, y = 180)
    screen.drawDot(shape = DotShape(), x = 256.1f, y = 180.2f)

    screen.drawCircle(shape = CircleShape(), x = 510, y = 344)
    screen.drawCircle(shape = CircleShape(), x = 510.8f, y = 344.2f)

    screen.drawSquare(shape = SquareShape(), x = 120, y = 250)
    screen.drawSquare(shape = SquareShape(), x = 120.2f, y = 250.1f)
}