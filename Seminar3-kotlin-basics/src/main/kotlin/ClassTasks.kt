/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

import kotlin.math.PI

open class Point(val X: Double, val Y: Double) {
    open val area: Double
        get() = 0.0

    open fun display() {
        println("X = $X, Y = $Y")
    }
}

class Circle(X: Double, Y: Double, val radius: Double) : Point(X, Y) {
    override val area: Double
        get() = PI * radius * radius

    override fun display() {
        println("Circle: X = $X, Y = $Y, Radius = $radius, Area = $area")
    }
}

class Square(X: Double, Y: Double, val sideLength: Double) : Point(X, Y) {
    override val area: Double
        get() = sideLength * sideLength

    override fun display() {
        println("Square: X = $X, Y = $Y, Side Length = $sideLength, Area = $area")
    }
}


// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}