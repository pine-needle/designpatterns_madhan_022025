package com.pineneedle.designpatterns_solidprinciples.solid_principles.OCP

class RegularCustomer: DiscountStrategy {

    override fun applyDiscount(amount: Double): Double {
        return amount * 0.10
    }
}