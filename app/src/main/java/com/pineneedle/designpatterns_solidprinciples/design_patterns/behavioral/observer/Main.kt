package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.observer

fun main() {
    val weatherStation = WeatherStation()

    val mobileApp = MobileApp()
    val website = Website()

    weatherStation.addObserver(mobileApp)
    weatherStation.addObserver(website)

    weatherStation.setTemperature(25.5f)
    weatherStation.setTemperature(30.0f)

    weatherStation.removeObserver(mobileApp)

    weatherStation.setTemperature(28.3f)
}
