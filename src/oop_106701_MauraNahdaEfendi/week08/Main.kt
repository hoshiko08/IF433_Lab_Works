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
    val mixedList: List<Any> = listOf("Hello", 123, "World", 45.6)

    for (item in mixedList) {
        val text = item as? String
        if (text != null) {
            println("String: $text")
        }
    }

    for (item in mixedList) {
        val text = item as? String ?: "Not a String"
        println(text)
    }

    val nullableString: String? = null
    println(nullableString!!)

}