package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.singleton

fun main() {

    // returned an instance
    val log1 = CustomLogCat.getInstance()
    log1.log("first object created")

    // returned the same instance reference
    val log2 = CustomLogCat.getInstance()
    log2.log("second object created")
    log2.log("second object second log")

    log1.showLogs()
    log2.showLogs()

}