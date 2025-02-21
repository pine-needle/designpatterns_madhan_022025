package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.strategy

class ShoppingCart {
    private var paymentStrategy: PaymentStrategy? = null

    fun setPaymentStrategy(strategy: PaymentStrategy) {
        this.paymentStrategy = strategy
    }

    fun checkout(amount: Double) {
        if (paymentStrategy == null) {
            println("No payment method selected!")
        } else {
            paymentStrategy?.pay(amount)
        }
    }
}