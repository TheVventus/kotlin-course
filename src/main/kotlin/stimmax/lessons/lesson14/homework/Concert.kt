package org.example.stimmax.lessons.lesson14.homework

class Concert(val group: String, val place: String, val price: Int, val capacity: Int){

    private var soldTickets: Int = 0

    fun concertInfo(){
        println("Группа: $group. Место проведения концерта: $place. Цена билета: $price. Вместимость зала: $capacity")
    }

    fun buyTicket(){
        if (soldTickets < capacity){
            soldTickets++
        }
        else {
            println("Билетов нет")
        }
    }

}