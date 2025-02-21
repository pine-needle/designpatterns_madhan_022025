package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.builder

fun main() {
    val textViewTag1 = TextViewTag.Builder()
        .setId("2342") // id is mandatory
        .setText("screen title")
        .setMargin("10dp")
        .build()


    val textViewTag2 = TextViewTag.Builder()
        .setId("1212") // id is mandatory
        .setColor("red")
        .setPadding("20dp")
        .build()

    println("textViewTag1 -> ${textViewTag1.toString()}")

    println("textViewTag2 -> ${textViewTag2.toString()}")

}