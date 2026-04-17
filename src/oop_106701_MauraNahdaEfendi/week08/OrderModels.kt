package oop_106701_MauraNahdaEfendi.week08

data class Address(
    val city: String?
)

data class Customer(
    val address: Address?
)

data class Order(
    val customer: Customer?
)