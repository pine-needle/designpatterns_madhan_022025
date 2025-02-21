package com.pineneedle.designpatterns_solidprinciples.solid_principles.ISP

class MyLayout: Spacing {
    override fun padding() {
        println("padding added to the layout")
    }

    override fun margin() {
        println("margins added to the layout")
    }
}