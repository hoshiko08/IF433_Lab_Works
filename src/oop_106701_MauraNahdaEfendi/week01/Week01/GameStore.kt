package oop_106701_MauraNahdaEfendi.week01.Week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("Game: $title")
    println("Final Price: Rp $finalPrice")
}
