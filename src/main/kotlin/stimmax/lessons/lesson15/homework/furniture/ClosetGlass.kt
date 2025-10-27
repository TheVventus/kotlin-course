package org.example.stimmax.lessons.lesson15.homework.furniture

class ClosetGlass(name: String, material: String, cost: Int, size: Int): Closet(name, material, cost, size) {
    fun closetGlassFun() {
        println("Функция стекла у шкафа")
    }
}