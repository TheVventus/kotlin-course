package org.example.stimmax.lessons.lesson16.homework.animal

class Dog: Animal() {
    override fun makeSound() {
        printColored("Bark", Colors.GREEN)
    }
}