package org.example.stimmax.lessons.lesson11.homework
fun main() {

    func1()
    println(func2(1, 1))
    func3("Arg 3")
    println(func4(listOf(1, 2, 3)))
    println(func5(""))

    println(multiplyByTwo(5))

    println(isEven(11))
    println(isEven(8))

    printNumbersUntil(10)
    printNumbersUntil (0)

}

fun func1() {
    println("Task 1")
}

fun func2(a: Int, b: Int): Int {
    return a + b
}

fun func3(a: String) {
    println("Task 3")
}

fun func4(a: List<Int>): Double {
    return a.sum().toDouble() / a.size
}

private fun func5(a: String?): Int? {
    return a?.length
}

// Задачи на написание кода

fun multiplyByTwo(a: Int): Int {
    return a * 2
}

fun isEven(a: Int): Boolean {
    return a % 2 == 0
}

fun printNumbersUntil(n: Int) {
    for(n in 1..n)
        println(n)
        if (n < 1)
            return
}