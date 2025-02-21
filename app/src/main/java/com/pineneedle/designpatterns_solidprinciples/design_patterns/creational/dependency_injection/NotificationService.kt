package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.dependency_injection

class NotificationService(
    var notificationProvider: NotificationProvider
) {

    fun sendNotification(message: String){
        notificationProvider.sendNotification(message)
    }
}