package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

class HasMoneyState: VendingMachineState  {
    override fun insertMoney(machine: VendingMachine) {
        println("Money already inserted. Please select an item.")
    }

    override fun selectItem(machine: VendingMachine) {
        println("Item selected. Dispensing now...")
        machine.state = DispensingState()
    }

    override fun dispenseItem(machine: VendingMachine) {
        println("Select an item first before dispensing.")
    }
}