package org.example.stimmax.lessons.lesson16.homework.animal

class Cat: Animal() {
    override fun makeSound() {
        printColored("Meow", Colors.BLACK)
    }
}