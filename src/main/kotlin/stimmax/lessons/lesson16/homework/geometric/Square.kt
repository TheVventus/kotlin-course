package org.example.stimmax.lessons.lesson16.homework.geometric

import kotlin.math.pow

class Square(var a: Int): Shape() {
    override fun area(): Double {
        return a.toDouble().pow(2.0)
    }
}