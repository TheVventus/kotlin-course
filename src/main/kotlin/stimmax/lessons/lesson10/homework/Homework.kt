package org.example.stimmax.lessons.lesson10.homework

fun main() {
    val map1 = mapOf<Int, Int>()

    val map2 = mapOf(18.0f to 0.12, 22.3f to 2.5)

    val map3 = mutableMapOf<Int, String>()

    val map4 = mutableMapOf(0 to "Берлин", 1 to "Москва")
    map4[2] = "Амстердам"
    map4[3] = "Астана"

    // Задание 5
    val task5 = map4[0]
    val task51 = map4[11]
    println(task5)
    println(task51)

    // Задание 6
    map4.remove(3)

    // Задачи на подбор оптимального типа для словаря
    val library = mapOf<String, List<String>>()

    val plants = mapOf<String, List<String>>()

    val quarterFinals = mapOf<String, List<String>>()

    val courseOfTreatment = mapOf<String, List<String>>()

    val travels = mapOf<String, Map<String, List<String>>>()

}