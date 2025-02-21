package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

interface VendingMachineState {
    fun insertMoney(machine: VendingMachine)
    fun selectItem(machine: VendingMachine)
    fun dispenseItem(machine: VendingMachine)
}
