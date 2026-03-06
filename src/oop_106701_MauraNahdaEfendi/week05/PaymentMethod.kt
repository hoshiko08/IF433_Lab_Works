package oop_106701_MauraNahdaEfendi.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}