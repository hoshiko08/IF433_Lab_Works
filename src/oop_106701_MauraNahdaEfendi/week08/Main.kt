package oop_106701_MauraNahdaEfendi.week08

fun main() {

    val order = Order(
        Customer(
            Address("Jakarta")
        )
    )

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)

    // let usage
    order.customer?.address?.city?.let {
        println("City found: $it")
    }
}