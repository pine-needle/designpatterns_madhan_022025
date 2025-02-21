package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.state

class VendingMachine {
    var state: VendingMachineState = IdleState()

    fun insertMoney() {
        state.insertMoney(this)
    }

    fun selectItem() {
        state.selectItem(this)
    }

    fun dispenseItem() {
        state.dispenseItem(this)
    }
}