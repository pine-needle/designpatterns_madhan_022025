package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

class RemoteControl {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }
}