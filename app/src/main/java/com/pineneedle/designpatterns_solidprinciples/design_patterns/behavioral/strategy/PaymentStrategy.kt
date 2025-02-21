package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.strategy

interface PaymentStrategy {
    fun pay(amount: Double)
}