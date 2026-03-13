package oop_106701_MauraNahdaEfendi.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa. [cite: 116]
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action [cite: 119]
}

fun main() {
    // Pengujian dari Latihan B & C
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnon()
    // Pengujian dari Latihan E (Decoupling)
    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}