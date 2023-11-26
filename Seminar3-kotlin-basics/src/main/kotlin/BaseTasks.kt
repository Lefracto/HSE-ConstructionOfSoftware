import kotlin.math.sqrt

/**
Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
(0.5 балла)
Формат вывода:
" Фамилия:
Имя:
Отчество:
"
 */
fun askForInput() {
    println("Введите ваше ФИО: ")
    val fullName = readLine()

    if (!fullName.isNullOrBlank()) {
        val parts = fullName.split(" ")

        val lastName = parts[0]
        val firstName = parts[1]
        val middleName = parts[2]

        println("Фамилия: $lastName")
        println("Имя: $firstName")
        println("Отчество: $middleName")
    }
}

/**
Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val discriminant = b * b - 4 * a * c

    if (discriminant > 0) {
        val x1 = (-b + sqrt(discriminant)) / (2 * a)
        val x2 = (-b - sqrt(discriminant)) / (2 * a)
        return Pair(x1, x2)
    } else if (discriminant == 0.0) {
        val x = -b / (2 * a)
        return Pair(x, x)
    } else {
        return Pair(Double.NaN, Double.NaN)
    }
}

/**
Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
(2 балла)
 */
fun printSameDigitNumbers() {
    println("Трёхзначные десятичные числа, все цифры которых одинаковы:")

    for (number in 100 until 1000) {
        val digit1 = number / 100
        val digit2 = (number % 100) / 10
        val digit3 = number % 10

        if (digit1 == digit2 && digit2 == digit3) {
            println(number)
        }
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}
