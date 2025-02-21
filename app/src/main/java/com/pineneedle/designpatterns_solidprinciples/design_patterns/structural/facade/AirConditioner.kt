package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.facade

class AirConditioner {
    fun turnOn() = println("Air Conditioner is ON")
    fun setTemperature(temp: Int) = println("Air Conditioner set to $temp°C")
    fun turnOff() = println("Air Conditioner is OFF")
}