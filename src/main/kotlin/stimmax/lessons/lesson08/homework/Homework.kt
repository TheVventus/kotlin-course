package org.example.stimmax.lessons.lesson08.homework

fun main() {
    example1("Это невозможно выполнить за один день")
    example1("Я не уверен в успехе этого проекта")
    example1("Произошла катастрофа на сервере")
    example1("Этот код работает без проблем")
    example1("Удача")

}


fun example1(arg: String) {
    val result = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        !arg.contains(" ") -> "Иногда, $arg, но не всегда"
    else -> arg
    }
    println(result)
}