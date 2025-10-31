package org.example.stimmax.lessons.lesson16.homework.printer

import org.example.stimmax.lessons.lesson16.homework.animal.Background
import org.example.stimmax.lessons.lesson16.homework.animal.Colors
import org.example.stimmax.lessons.lesson16.homework.animal.printColored

class InkjetPrinter: Printer (){
    override fun print(text: String) {
        val list = text.split(" ")

        val colorPairs = listOf(
            Pair(Colors.RED, Background.YELLOW),
            Pair(Colors.GREEN, Background.BLUE),
            Pair(Colors.BLUE, Background.WHITE),
            Pair(Colors.PURPLE, Background.GREEN),
            Pair(Colors.YELLOW, Background.BLUE),
            Pair(Colors.BLUE, Background.RED)
        )

        list.forEachIndexed { index, result ->
            val pair = colorPairs[index % colorPairs.size]
            printColored(result, pair.first, pair.second)
        }
    }
}