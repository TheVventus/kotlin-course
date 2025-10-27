package org.example.stimmax.lessons.lesson15.homework.furniture

open class Closet(name: String, material: String, cost: Int, size: Int): Furniture(name, material, cost) {
    fun closetFun() {
        println("Функция шкафа")
    }
}