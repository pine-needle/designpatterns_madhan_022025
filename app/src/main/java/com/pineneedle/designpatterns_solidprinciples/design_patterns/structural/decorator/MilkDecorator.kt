package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.decorator

class MilkDecorator(private val coffee: Coffee): Coffee{
    override fun cost(): Double {
        return coffee.cost() + 2.0
    }

    override fun ingredients() {
        println("simple coffee + milk")
    }

}

