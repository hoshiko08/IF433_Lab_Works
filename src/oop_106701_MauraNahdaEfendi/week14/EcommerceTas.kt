package oop_106701_MauraNahdaEfendi.week14

import java.io.File

class BadOrderProcessor {

    private val file = File("orders.csv")

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName")

        file.appendText("$itemName,$finalPrice\n")

        println(
            "Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, price: Double)
}

class CsvOrderRepository : OrderRepository {

    override fun saveOrder(itemName: String, price: Double) {
        File("orders.csv").appendText("$itemName,$price\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
)