package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.factory

fun main() {

    val tag1 = ViewTagFactory.createViewTag("text") // for textView
    val tag2 = ViewTagFactory.createViewTag("button") // for ButtonView

    // returns default view tag
    val tag3 = ViewTagFactory.createViewTag("buttton") // wrong parameter value

    tag1.printView()
    tag2.printView()
    tag3.printView()

}