package org.example.stimmax.lessons.lesson14.homework

class Emotion(val type: String, var intensity: Int) {
    fun express() {
        println("Тип эмоции: $type, Интенсивность: $intensity")
    }
}