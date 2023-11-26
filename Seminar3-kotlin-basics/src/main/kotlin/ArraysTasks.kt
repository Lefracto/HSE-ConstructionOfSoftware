
/**
    Задание 1: Сформировать целочисленный массив A из N элементов
    при помощи ввода значений с клавиатуры (N вводит пользователь).
    Вывести массив на экран. (1 балл)
 */
fun makeArray(): Array<Int> {
    print("Введите длину массива: ")
    val arrayLength = readln().toInt()
    val array = Array<Int>(arrayLength) {0};

    for (i in 0..<arrayLength step 1) {
        print("Введите один из элементов: ")
        array[i] = readln().toInt()
    }

    println("Массив имеет вид: ${array.joinToString()}")
    return array
}

/**
    Задание 2: Написать функцию для сортировки массива по убыванию и его вывода на экран.
    Использовать встроенные функции. (0.5 балла)
 */
fun sortArrayDesc(arr: Array<Int>) {
    val sortedArray = arr.sortedDescending()
    println("Отсортированный массив по убыванию: ${sortedArray.joinToString()}")
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val arr = makeArray()
    sortArrayDesc(arr)
}

