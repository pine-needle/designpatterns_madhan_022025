package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.strategy

class CreditCardPayment(private val cardNumber: String):PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $$amount using Credit Card (Card Number: $cardNumber)")
    }
}