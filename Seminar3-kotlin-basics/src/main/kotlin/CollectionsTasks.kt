/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val uniqueElements = HashSet<String>()
    return array.map { element ->
        if (uniqueElements.contains(element)) {
            "blahblah"
        } else {
            uniqueElements.add(element)
            element
        }
    }
}

/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val words = text.split(" ")
    val uniqueWordsSet = mutableSetOf<String>()

    for (word in words) {
        uniqueWordsSet.add(word)
    }

    return uniqueWordsSet.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {

    val input1 = "I like Kotlin, I like C++, we adore C#"
    val output1 = uniqueWords(input1)
    println("Test 1:")
    println("Input: $input1")
    println("Output: $output1")
    println()

    val input2 = listOf("C#", "Swift", "C#", "C", "C++", "Swift")
    val output2 = replaceElements(input2)
    println("Test 2:")
    println("Input: $input2")
    println("Output: $output2")
    println()
}