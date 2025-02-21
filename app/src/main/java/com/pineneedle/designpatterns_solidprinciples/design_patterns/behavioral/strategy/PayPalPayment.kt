package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.strategy

class PayPalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $$amount using PayPal (Email: $email)")
    }
}