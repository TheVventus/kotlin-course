package org.example.stimmax.lessons.lesson24.homework

// 1
fun ex1(arg: Boolean, fnc: (String) -> Unit): Int {
    return 0
}
// 2
fun Int.ex2(fnc: Int.(String) -> List<String>): List<String> {
    return fnc("")
}
// 3
fun <T, R> T.ex3(fnc: T.() -> R): R {
    return fnc()
}
// 4
fun ex4(arg: String): () -> String {
    val fnc: () -> String = { arg }
    return fnc
}
// 5
fun <U> U.ex5(): (String) -> U {
    val fnc: (String) -> U = { this }
    return fnc
}