package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

class IdleState: VendingMachineState  {
    override fun insertMoney(machine: VendingMachine) {
        println("Money inserted. You can now select an item.")
        machine.state = HasMoneyState()
    }

    override fun selectItem(machine: VendingMachine) {
        println("Insert money first before selecting an item.")
    }

    override fun dispenseItem(machine: VendingMachine) {
        println("You need to insert money and select an item first.")
    }
}