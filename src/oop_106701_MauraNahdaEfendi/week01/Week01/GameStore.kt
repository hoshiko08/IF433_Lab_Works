package oop_106701_MauraNahdaEfendi.week01.Week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
}
fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100
