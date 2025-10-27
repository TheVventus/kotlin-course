package org.example.stimmax.lessons.lesson15.homework.education

class HighSchool(name: String, people: Int, schoolGrade: Int, highSchoolRules: String): School(name, people, schoolGrade) {
    fun highSchoolFun() {
        println("Функция старшей школы")
    }
}