package org.example.stimmax.lessons.lesson16.homework.animal

fun main() {
    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

    val bird = Bird()
    bird.makeSound()

    val animalList = listOf(dog, cat, bird)
    animalList.forEach { it.makeSound() }
}
