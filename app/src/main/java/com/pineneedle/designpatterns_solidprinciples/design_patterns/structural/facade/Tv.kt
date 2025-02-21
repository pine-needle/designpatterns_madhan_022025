package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.facade

class Tv {
    fun turnOn() = println("TV is ON")
    fun setChannel(channel: Int) = println("TV set to channel $channel")
    fun turnOff() = println("TV is OFF")
}