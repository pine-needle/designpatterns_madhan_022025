package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.observer

class MobileApp : Observer {
    override fun update(temperature: Float) {
        println("MobileApp: Weather updated! Current temperature: $temperature°C")
    }
}