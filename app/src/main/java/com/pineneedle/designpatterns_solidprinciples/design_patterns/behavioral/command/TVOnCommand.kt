package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

class TVOnCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.turnOn()
    }
}
