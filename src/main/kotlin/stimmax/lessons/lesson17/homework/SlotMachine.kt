package org.example.stimmax.lessons.lesson17.homework

class SlotMachine(
    val color: String,
    val model: String,
    val owner: String,
    val supportPhone: String
) {
    private var isPowerOn: Boolean = false
    private var isOSLoaded: Boolean = false
    var listGames: MutableList<String> = mutableListOf("Game1", "Game2", "Game3")
    private var isHaveGamepad: Boolean = false
    private var balance: Int = 0
    private var isGameSessionPaid: Boolean = false
    var costOneGameSession: Int = 10
    private var pinCodeMachine: Int = 43682

    fun powerOn() {
        isPowerOn = true
        println("Автомат включен.")
    }

    fun powerOff() {
        isPowerOn = false
        isOSLoaded = false
        println("Автомат выключен.")
    }

    fun loadOs() {
        isOSLoaded = true
        println("ОС загружена.")
    }

    fun shutdownOs() {
        isOSLoaded = false
        println("ОС завершила работу.")
    }

    fun showGames() {
        println("Список игр: ${listGames.joinToString()}")
    }

    fun startGame(gameName: String) {
        if (isOSLoaded && listGames.contains(gameName)) {
            println("Игра '$gameName' запущена!")
            isGameSessionPaid = false
        } else {
            println("Ошибка: игра не найдена или ОС не загружена.")
        }
    }

    fun paySession(amount: Int): Boolean {
        return if (amount >= costOneGameSession) {
            balance += costOneGameSession
            isGameSessionPaid = true
            println("Сеанс оплачен.")
            true
        } else {
            println("Недостаточно средств.")
            false
        }
    }

    private fun withdrawCash(pin: Int): Int {
        return if (pin == pinCodeMachine) {
            val cash = balance
            balance = 0
            println("Выдано: $cash")
            cash
        } else {
            println("Неверный пин-код!")
            0
        }
    }

    fun openSafeAndWithdraw(pin: Int) {
        val amount = withdrawCash(pin)
        if (amount > 0) println("Сейф открыт, наличные выданы.")
    }


}