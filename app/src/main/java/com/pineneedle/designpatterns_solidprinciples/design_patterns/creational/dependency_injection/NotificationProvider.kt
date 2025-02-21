package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.dependency_injection

interface NotificationProvider {
    fun sendNotification(message: String)
}