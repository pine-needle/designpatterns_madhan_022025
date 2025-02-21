package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

class TVOffCommand(private val tv: TV) : Command {
    override fun execute() {
        tv.turnOff()
    }
}