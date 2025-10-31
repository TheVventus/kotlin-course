package org.example.stimmax.lessons.lesson16.homework.printer

import org.example.stimmax.lessons.lesson16.homework.animal.Background
import org.example.stimmax.lessons.lesson16.homework.animal.Colors
import org.example.stimmax.lessons.lesson16.homework.animal.printColored

class LaserPrinter: Printer() {
    override fun print(text: String) {
        val list = text.split(" ")
        list.forEach { printColored(it, Colors.BLACK, Background.WHITE) }
    }
}