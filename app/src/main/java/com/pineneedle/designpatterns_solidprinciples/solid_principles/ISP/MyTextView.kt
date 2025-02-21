package com.pineneedle.designpatterns_solidprinciples.solid_principles.ISP

class MyTextView: Spacing, Transformation {

    override fun padding() {
        println("padding added to the text")
    }

    override fun margin() {
        println("margins added to the text")
    }

    override fun increseSize() {
        println("text size increased")
    }

    override fun decreaseSize() {
        println("text size decreased")
    }

    override fun fontFamily() {
        println("font family changed")
    }

    override fun fontWeight() {
        println("font weight changed")
    }
}