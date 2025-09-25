package org.example.stimmax.lessons.lesson07.homework

fun main() {

    // Задание 1
    println ("Задание 1")
    for (i in 1..5) {
        println(i)
    }

    // Задание 2
    println ("Задание 2")
    for (i in 1..10) {
        if ( i % 2 == 0) {
            println(i)
        }
    }

    // Задание 3
    println ("Задание 3")
    for (i in 5 downTo 1) {
        println(i)
    }

    // Задание 4
    println ("Задание 4")
    for (i in 10 downTo 1) {
        println(i - 2)
    }

    // Задание 5
    println ("Задание 5")
    for (i in 1..9 step 2) {
        println(i)
    }

    // Задание 6
    println ("Задание 6")
    for (i in 1..20 step 3) {
        println(i)
    }

    // Задание 7
    println ("Задание 7")
    val size: Int = 11
    for (i in 3 until size step 2) {
        println(i)
    }

    // Задание 8
    println ("Задание 8")
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }

    // Задание 9
    println ("Задание 9")
    var counter = 10
    while (counter >= 5) {
        counter--
        if (counter == 5) println(counter)
    }

    // Задание 10
    println ("Задание 10")
    var counter2 = 5
    do {
        println(counter2)
    } while (counter2-- > 1)

    // Задание 11
    println ("Задание 11")
    var counter3 = 5
    do {
        println(counter3)
    } while (counter3++ < 10)

    // Задание 12
    println ("Задание 12")
    for (i in 1..10) {
        println(i)
        if (i == 6) break
    }

    // Задание 13
    println ("Задание 13")
    var counter4 = 1
    while (true) {
        println(counter4)
        if (counter4 == 10) break
        counter4++
    }

    // Задание 14
    println ("Задание 14")
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    // Задание 15
    println ("Задание 15")
    var counter5 = 1
    while (counter5 <= 10) {
        if (counter5 % 3 == 0) {
            counter5++
            continue
        }
        println(counter5)
        counter5++
    }

    // Задачи повышенной сложности
    // Задание 1
    println ("Задание повышенной сложности №1")
    for (i in 1..10) {
        for (j in 1..10) {
            print(" " + i * j + " ")
        }
        println()
    }

    // Задание 2
    println ("Задание повышенной сложности №2")
    fun sum (arg: Int): Int {
        var result = 0
        for (i in 1..arg) {
            result += i
        }
        return result
    }
    println(sum(10))

    // Задание 3
    println ("Задание повышенной сложности №3")

}
