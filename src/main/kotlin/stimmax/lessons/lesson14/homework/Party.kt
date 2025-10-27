package org.example.stimmax.lessons.lesson14.homework

class Party(var location: String, var attendees: Int) {
    fun details() {
        println("Место проведение: $location, количество гостей: $attendees")
    }
}