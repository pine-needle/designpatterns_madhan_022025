package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.dependency_injection

class EmailProvider: NotificationProvider {

    override fun sendNotification(message: String) {
        println("Email Notification --> $message")
    }
}