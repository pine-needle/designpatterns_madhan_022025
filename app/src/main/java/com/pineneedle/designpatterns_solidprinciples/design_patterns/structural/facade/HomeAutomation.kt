package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.facade

class HomeAutomation(
    private val lights: Lights,
    private val ac: AirConditioner,
    private val tv: Tv) {

    fun startMovieMode() {
        println("Starting Movie Mode...")
        lights.turnOff()
        ac.turnOn()
        ac.setTemperature(22)
        tv.turnOn()
        tv.setChannel(5)
    }

    fun endMovieMode() {
        println("Ending Movie Mode...")
        lights.turnOn()
        ac.turnOff()
        tv.turnOff()
    }
}