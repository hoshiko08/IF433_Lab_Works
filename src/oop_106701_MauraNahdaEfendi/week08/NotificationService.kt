package oop_106701_MauraNahdaEfendi.week08

class NotificationService {

    fun sendEmail(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        } else {
            println("Email is not available")
        }
    }
}