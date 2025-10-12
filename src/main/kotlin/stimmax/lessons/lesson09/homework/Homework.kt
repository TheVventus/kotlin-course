package org.example.stimmax.lessons.lesson09.homework

fun main() {

    // Работа с массивами Array

    val array1 = arrayOf(1, 2, 3, 4, 5)

    val array2 = Array(10) { "" }

    val array3 = DoubleArray(5)
    for (i in array3.indices) {
        array3[i] = i * 2.0
    }

    val array4 = arrayOf(1, 2, 3, 4, 5)
    for (i in array4.indices) {
        array4[i] = array4[i] * 3
    }

    val array5 = Array<String?>(3) {null}
    array5[0] = "Test"
    array5[1] = "Task5"

    val array6 = arrayOf(1, 2, 3, 4, 5)
    val newArray6 = Array(array6.size) { 0 }
    for (i in array6.indices) {
        newArray6[i] = array6[i]
    }

    val array7 = arrayOf(1, 2, 3, 4, 5)
    val array71 = arrayOf(6, 7, 8, 9, 10)
    val result7 = Array(array7.size) {0}
    for (i in array7.indices)
        result7[i] = array71[i] - array7[i]

    val array8 = arrayOf(6, 7, 2, 4, 3)
    var counter = 0
    var found = -1
    while (counter < array8.size) {
        if (array8[counter] == 5) {
            found = counter
            println(found)
            break
        }
        counter++
    }
    println(found)

    // Работа со списками List

    val list1: List<Int> = listOf()

    val list2 = listOf("Hello", "World", "Kotlin")

    val list3 = mutableListOf(1, 2, 3, 4, 5)

    // Задание 4
    list3.add(6)
    list3.add(7)
    list3.add(8)

    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.removeAt(1)

    // Задание 6
    for (i in list3)
        println(i)

    // Работа со Множествами Set

    val set1: Set<Int> = emptySet()

    val set2: Set<Int> = setOf(1, 2, 3)

    val set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

    // Задание 4
    set3.add("Swift")
    set3.add("Go")
}
