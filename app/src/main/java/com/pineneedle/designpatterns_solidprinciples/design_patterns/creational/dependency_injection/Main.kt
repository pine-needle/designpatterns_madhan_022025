package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.dependency_injection

fun main() {

    // SMS Notification
    var notify = NotificationService(SMSProvider())
    notify.sendNotification("Hi, How are you?")

    // changes the dependency to email provider at runtime
    notify.notificationProvider = EmailProvider()
    notify.sendNotification("best regards to you")

    // Email Notification
    notify = NotificationService(EmailProvider())
    notify.sendNotification("Hi, How are you?")
}