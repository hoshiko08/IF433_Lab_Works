package oop_106701_MauraNahdaEfendi.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa. [cite: 116]
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...") [cite: 118]
    method.pay(amount) // Dynamic polymorphism in action [cite: 119]
}

fun main() {
    // Pengujian dari Latihan B & C
    val myWatch = Smartwatch() [cite: 121]
    myWatch.showTime() [cite: 122]

    val myPhone = Smartphone() [cite: 123]
    myPhone.turnon() [cite: 124]

    // Pengujian dari Latihan E (Decoupling)
    val pay1 = Gopay() [cite: 125]
    val pay2 = CreditCard() [cite: 126, 127]

    println("\n=== TESTING CHECKOUT ===") [cite: 128]
    processCheckout(method = pay1, amount = 50000.0) [cite: 129, 131]
    processCheckout(method = pay2, amount = 150000.0) [cite: 130, 131]
}