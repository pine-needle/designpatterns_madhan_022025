package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.strategy

fun main() {
    val cart = ShoppingCart()

    cart.setPaymentStrategy(CreditCardPayment("1234-5678-9876-5432"))
    cart.checkout(100.0)

    cart.setPaymentStrategy(PayPalPayment("user@example.com"))
    cart.checkout(50.0)
}