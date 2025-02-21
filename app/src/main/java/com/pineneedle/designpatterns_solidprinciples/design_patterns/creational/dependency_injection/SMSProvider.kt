package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.dependency_injection

class SMSProvider: NotificationProvider {

    override fun sendNotification(message: String) {
        println("SMS Notification --> $message")
    }
}