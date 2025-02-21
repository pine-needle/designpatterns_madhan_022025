package com.pineneedle.designpatterns_solidprinciples.solid_principles.OCP

interface DiscountStrategy {
    fun applyDiscount(amount: Double): Double
}