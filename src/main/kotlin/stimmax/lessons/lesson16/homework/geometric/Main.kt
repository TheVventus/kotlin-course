package org.example.stimmax.lessons.lesson16.homework.geometric

fun main() {

    val circle = Circle(10.4)
    val square = Square(4)
    val triangle = Triangle(3, 4, 90)

    val geometicList = listOf(circle, square, triangle)
    geometicList.forEach { println(it.area()) }
}