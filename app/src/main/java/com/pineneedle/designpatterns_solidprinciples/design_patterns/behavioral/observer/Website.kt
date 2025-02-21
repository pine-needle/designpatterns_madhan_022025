package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.observer

class Website : Observer {
    override fun update(temperature: Float) {
        println("Website: Displaying new temperature: $temperature°C")
    }
}