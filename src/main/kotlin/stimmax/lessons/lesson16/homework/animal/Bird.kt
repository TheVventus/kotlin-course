package org.example.stimmax.lessons.lesson16.homework.animal

class Bird: Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.WHITE)
    }
}