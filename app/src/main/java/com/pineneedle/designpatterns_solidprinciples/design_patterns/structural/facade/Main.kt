package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.facade

fun main() {
    // Create instances of subsystems
    val lights = Lights()
    val ac = AirConditioner()
    val tv = Tv()

    // Use facade to simplify interaction
    val homeAutomation = HomeAutomation(lights, ac, tv)

    homeAutomation.startMovieMode()
    println("Enjoy your movie!\n")

    homeAutomation.endMovieMode()
    println("Movie mode ended.")
}