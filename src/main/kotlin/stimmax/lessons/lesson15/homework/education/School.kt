package org.example.stimmax.lessons.lesson15.homework.education

open class School(name: String, people: Int, schoolGrade: Int): Education(name, people) {
    fun schoolFun() {
        println("Функция школы")
    }
}