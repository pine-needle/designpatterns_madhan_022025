package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.decorator

class SimpleCoffee: Coffee {
    override fun cost(): Double {
        return 10.0
    }

    override fun ingredients() {
        println("Simple coffee")
    }
}