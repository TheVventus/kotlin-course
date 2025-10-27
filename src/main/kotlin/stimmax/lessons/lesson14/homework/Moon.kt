package org.example.stimmax.lessons.lesson14.homework

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase(){
        if (isVisible) {
            println("Текущая фаза луны: $phase")
        }
        else {
            println("Луну не видно")
        }
    }
}
fun main(){
    Moon.showPhase()
}