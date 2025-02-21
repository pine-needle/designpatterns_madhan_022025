package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.observer

interface Subject {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}