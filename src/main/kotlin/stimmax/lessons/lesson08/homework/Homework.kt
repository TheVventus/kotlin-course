package org.example.stimmax.lessons.lesson08.homework

fun main() {
    example1("Это невозможно выполнить за один день")
    example1("Я не уверен в успехе этого проекта")
    example1("Произошла катастрофа на сервере")
    example1("Этот код работает без проблем")
    example1("Удача")

    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    example2(log)

    val exp3 = "4539 1488 0343 6467"
    example3(exp3)

    val exp4 = "username@example.com"
    example4(exp4)

    val exp5 = "C:/Пользователи/Документы/report.txt"
    val exp51 = "D:/good.themes/dracula.theme"
    example5(exp5)
    example5(exp51)

    val exp6 = "Котлин лучший язык программирования"
    example6(exp6)
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

fun example2(arg: String) {
    val arrayString = arg.split("->")
    val rightString = arrayString[1].trim().split(" ")
    val date = rightString[0]
    val time = rightString[1]
    println(date)
    println(time)
}

fun example3(arg: String) {
    val result = arg.replace(Regex(".(?=.{4})"), "*")
    println(result)
}

fun example4(arg: String) {
    val replaceResult1 = arg.replace("@", " [at] ")
    val result = replaceResult1.replace(".", " [dot] ")
    println(result)
}

fun example5(arg: String) {
    val result = arg.split("/")
    println(result.last())
}

fun example6(arg: String) {
    val arraySplit = arg.trim().split(" ")
    var letter = ""
    for (i in 0..arraySplit.size - 1)
        letter += arraySplit[i][0].uppercase()
    println(letter)
}