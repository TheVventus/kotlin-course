package org.example.stimmax.lessons.lesson16.homework.cart

class ShoppingCart {
    private val items: MutableMap<Int, Int> = mutableMapOf()

    fun addToCart(itemId: Int) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(itemsToAdd: Map<Int, Int>) {
        for ((id, amount) in itemsToAdd) {
            items[id] = (items[id] ?: 0) + amount
        }
    }

    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = (items[id] ?: 0) + 1
        }
    }

    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста."

        val sb = StringBuilder()
        sb.appendLine("🛒 Содержимое корзины:")
        sb.appendLine("--------------------------------")
        sb.appendLine(String.format("%-10s | %-10s", "ID товара", "Количество"))
        sb.appendLine("--------------------------------")

        var totalItems = 0
        for ((id, amount) in items) {
            sb.appendLine(String.format("%-10d | %-10d", id, amount))
            totalItems += amount
        }

        sb.appendLine("--------------------------------")
        sb.appendLine("Всего артикулов: ${items.size}")
        sb.appendLine("Общее количество товаров: $totalItems")
        return sb.toString()
    }
}

fun main() {
    val cart = ShoppingCart()

    cart.addToCart(101)
    cart.addToCart(102)

    cart.addToCart(101, 3)
    cart.addToCart(mapOf(103 to 5, 104 to 2))
    cart.addToCart(listOf(101, 103, 105, 106))

    println(cart)
}
