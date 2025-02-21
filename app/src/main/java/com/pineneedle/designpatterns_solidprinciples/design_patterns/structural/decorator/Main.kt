package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.decorator

fun main() {

    val simpleCoffee: Coffee = SimpleCoffee()

    val milkCoffee = MilkDecorator(simpleCoffee)
    val sugarCoffee = SugarDecorator(milkCoffee)

    println(milkCoffee.cost())
    println(sugarCoffee.cost())
}