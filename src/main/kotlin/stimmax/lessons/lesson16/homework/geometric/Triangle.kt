package org.example.stimmax.lessons.lesson16.homework.geometric

import kotlin.math.sin

class Triangle(var a: Int, var b: Int, var c: Int): Shape() {
    override fun area(): Double {
        return (a * b * sin(c * Math.PI / 180)) / 2
    }
}