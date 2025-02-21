package com.pineneedle.designpatterns_solidprinciples.solid_principles.OCP

class PremiumCustomer: DiscountStrategy {
    override fun applyDiscount(amount: Double): Double {
        return amount * 0.20
    }
}