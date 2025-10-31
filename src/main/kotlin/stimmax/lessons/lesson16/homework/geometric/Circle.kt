package org.example.stimmax.lessons.lesson16.homework.geometric

import org.example.stimmax.lessons.lesson16.homework.animal.Colors
import org.example.stimmax.lessons.lesson16.homework.animal.printColored
import kotlin.math.pow

class Circle(var radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius.pow(2.0)
    }
}