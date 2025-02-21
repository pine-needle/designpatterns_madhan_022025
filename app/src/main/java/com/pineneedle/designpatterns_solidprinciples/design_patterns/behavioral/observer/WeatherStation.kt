package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.observer

class WeatherStation : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0.0f

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature)
        }
    }

    fun setTemperature(newTemperature: Float) {
        println("WeatherStation: New temperature update: $newTemperature°C")
        temperature = newTemperature
        notifyObservers()
    }
}