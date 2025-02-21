package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

fun main() {
    val machine = VendingMachine()

    machine.selectItem()
    machine.insertMoney()
    machine.selectItem()
    machine.insertMoney()
    machine.dispenseItem()
    machine.dispenseItem()
}