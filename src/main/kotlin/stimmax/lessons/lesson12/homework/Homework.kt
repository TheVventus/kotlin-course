package org.example.stimmax.lessons.lesson12.homework

fun main() {
    val arrayMoreFive = listOf(1, 2, 3, 4, 5, 6)

    if (arrayMoreFive.size > 5) {
        println("Список содержит больше 5 элементов")
    } else {
        println("Список содержит меньше 5 элементов")
    }

    if(arrayMoreFive.isEmpty()) {
        println("Список пустой")
    } else {
        println("Список не пустой")
    }

    if (arrayMoreFive.isNotEmpty()) {
        println("Список не пустой")
    } else {
        println("Список пустой")
    }

    val arrayGetIndex = arrayMoreFive.getOrElse(10) { 30 }
    println(arrayGetIndex)

    val arrayString = arrayMoreFive.toString()
    println(arrayString)

    val sumArray = arrayMoreFive.sum()
    println(sumArray)

    val avgArray = arrayMoreFive.average()
    println(avgArray)

    val maxArray = arrayMoreFive.max()
    println(maxArray)

    val minArray = arrayMoreFive.min()
    println(minArray)

    val firstArray = arrayMoreFive.firstOrNull()
    println(firstArray)

    val containsArray = arrayMoreFive.contains(1)
    println(containsArray)

    val newArray = listOf(1, 5, 6, 7, 19, 20, 25, 333, 14, 344, -3, 2, 5)

    val filterArray = newArray.filter { it in 18..30 }
    println(filterArray)

    val newFilterArray =  newArray.filter{ it % 2 != 0 && it % 3 != 0}
    println(newFilterArray)

    val stringArray = listOf("Kotlin", null, "Java", "Python")

    val clearNullArray = stringArray.filterNotNull()
    println(clearNullArray)

    val lengthWordArray = stringArray.map { it?.length }
    println(lengthWordArray)

    val resultArray = stringArray.associate { it?.reversed() to it?.length }
    println(resultArray)

    val sortNewArray = clearNullArray.sorted()
    println(sortNewArray)

    val firstThreeArray = newArray.take(3)
    println(firstThreeArray)

    arrayMoreFive.forEach{
        println("Квадрат числа $it = " + it * it)
    }

    val groupArrays = stringArray.groupBy { it?.first() }
    println(groupArrays)

    val newStringArray = listOf("Kotlin", "Java", "Java", "Python")
    val distinctArray = newStringArray.distinct()
    println(distinctArray)

    val reverseSortArray = arrayMoreFive.sortedDescending()
    println(reverseSortArray)

    val lastThreeArray = arrayMoreFive.takeLast(3)
    println(lastThreeArray)

    // Задача 24
    val arrayTask24 = listOf(155, 33333, 66666, 77777, 5)
    println(task24(arrayTask24))
    println(task24(arrayMoreFive))
}

fun task24(list: List<Int>): String {
    return when {
        list.isEmpty() -> "Пусто"
        list.size < 5 -> "Короткая"
        list.firstOrNull() == 0 -> "Стартовая"
        list.sum() > 10000 -> "Массивная"
        list.average() == 10.0 -> "Сбалансированная"
        list.joinToString("").length == 20 -> "Клейкая"
        (list.maxOrNull() ?: Int.MIN_VALUE) < -10 -> "Отрицательная"
        (list.minOrNull() ?: Int.MAX_VALUE) > 1000 -> "Положительная"
        list.contains(3) && list.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}