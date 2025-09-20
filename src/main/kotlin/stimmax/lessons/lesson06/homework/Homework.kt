package stimmax.lessons.lesson06.homework

fun main() {
    example1(3)
    example2(3)
    example3(1)
    example4(1343)
    example5("jpg")
    example6(50.0, 'C')
    example7(-35)
    example8(18)
}


fun example1 (arg: Int) {
    when (arg) {
        12, 1, 2 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        else -> println("Не удалось установить сезон года")
    }
}

fun example2 (arg: Int) {
    if (arg in 0..2) println("Возраст собаки равен " + (arg * 10.5) + " лет")
    else println("Возраст собаки равен " + (21 + arg * 4) + " лет")
}

fun example3 (arg: Int) {
    if (arg in 0..1) {
        println("Пешком")
    }
    else if (arg in 0..5) {
        println("Велосипед")
    }
    else println("Автотранспорт")
}

fun example4 (arg: Int) {
    if (arg < 1000) println((arg / 100) * 2)
    else println((arg / 100) * 3)
}

fun example5 (arg: String) {
    when (arg) {
        "txt", "doc" -> println("Текстовый документ")
        "png","jpg" -> println("Изображение")
        "xml" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

fun example6 (arg1: Double, arg2: Char) {
    if (arg2 == 'C') {
       println("Температура по фаренгейту равна ${arg1 * 1.8 + 32}$arg2")
    } else if (arg2 == 'F') {
        println("Температура по цельсию равна ${(arg1 - 32) * 5 / 9}$arg2")
    }
    else {
        println("Неизвестная единица измерения, используйте F или C")
    }
}

fun example7 (arg: Int) {
    when (arg) {
        in -29..9 -> println("куртка и шапка")
        in 10..18 -> println("ветровка")
        in 19..35 -> println("футболка и шорты")
        else -> println("не выходи из дома")
    }
}

fun example8 (arg: Int) {
    when (arg) {
        in 0..9 -> println("детские")
        in 10 until 18 -> println("подростковые")
        else -> println("18+")
    }
}