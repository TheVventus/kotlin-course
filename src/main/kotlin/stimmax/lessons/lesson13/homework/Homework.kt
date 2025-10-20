package org.example.stimmax.lessons.lesson13.homework

fun main() {

    val task1 = mapOf<String, Int>("test1" to 4, "test2" to 14, "test3" to 24)
    val avgTime = task1.values.average()
    println("Среднее время теста $avgTime")

    val task2 = mapOf<String, String>("method1" to "metadata1", "method2" to "metadata2", "method3" to "metadata3")
    val nameMethods = task2.keys
    println(nameMethods)

    val task3 = mutableMapOf<String, String>("test1" to "passed", "test2" to "failed", "test3" to "passed", "test4" to "skipped")
    task3["test5"] = "failed"
    println(task3)

    val task4 = task3.count{it.value == "passed"}
    println(task4)

    val task5 = mutableMapOf<String, String>("bug1" to "fixed", "bug2" to "in_work", "bug3" to "new")
    task5.remove("bug1")
    println(task5)

    val task6 = mapOf<String, String>("url1" to "200", "url2" to "404", "url3" to "500")
    task6.forEach {
        println("Cообщение о странице ${it.key} в статусе ${it.value}")
    }

    val task7 = mapOf<String, Int>("request1" to 25, "request2" to 44, "request3" to 67)
    val avg = task7.filterValues{ it > 30}
    println(avg)

    val task8 = mapOf<String, String>("endpoint1" to "200", "endpoint2" to "404", "endpoint3" to "500")
    val resultTask8 = task8["endpoint2"] ?: "не протестирован"
    println("Статус у ${task8.keys.elementAt(1)} = $resultTask8")

    val task9 = mutableMapOf<String, String>("browserType" to "chrome", "OS" to "iOS", "version" to "15.0.0")
    val resultTask9 = task9.getOrDefault("browserType", "browserType не задан")
    println(resultTask9)

    val task10 = mapOf<String, String>("ver1" to "1.0.0", "ver2" to "2.0.0", "ver3" to "3.0.0")
    val resultTask10 = task10 + ("ver4" to "4.0.0")
    println(resultTask10)

    val task11 = mapOf<String, String>("Iphone11" to "config1", "Pixel 9" to "config2", "Xiaomi 15" to "config3")
    val resultTask11 = task11.getOrElse("Iphone11") {"default"}
    println(resultTask11)

    val task12 = mapOf("code1" to "error1", "code2" to "error2", "code3" to "error3")
    val resultTask12 = task12.containsKey("code2")
    println(resultTask12)

    val task13 = mapOf<String, String>("Test1_01" to "Passed", "Test2_02" to "Failed", "Test3_03" to "Skipped")
    val resultTask13 = task13.filterKeys{it.contains("Test1_01")}
    println(resultTask13)

    val task14 = mapOf("auth" to "passed", "main" to "failed", "push" to "skipped")
    val resultTask14 = task14.any { it.value == "failed" }
    println(resultTask14)

    val task15 = mutableMapOf("setting1" to "55", "setting2" to "iOS")
    val newTask15 = mutableMapOf("newSetting1" to "delay", "newSetting2" to "flaky")
    newTask15.putAll(task15)
    println(newTask15)
}