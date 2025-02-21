package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

class DispensingState: VendingMachineState  {
    override fun insertMoney(machine: VendingMachine) {
        println("Please wait, dispensing in progress...")
    }

    override fun selectItem(machine: VendingMachine) {
        println("Already dispensing the selected item...")
    }

    override fun dispenseItem(machine: VendingMachine) {
        println("Item dispensed. Returning to idle state.")
        machine.state = IdleState()
    }
}