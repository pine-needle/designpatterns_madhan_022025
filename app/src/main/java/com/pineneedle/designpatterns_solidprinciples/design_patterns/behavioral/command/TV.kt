package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

class TV {
    fun turnOn() {
        println("TV is ON")
    }

    fun turnOff() {
        println("TV is OFF")
    }

    fun setChannel(channel: Int) {
        println("TV channel changed to $channel")
    }
}
