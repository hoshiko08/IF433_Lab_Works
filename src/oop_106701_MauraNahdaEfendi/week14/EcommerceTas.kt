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