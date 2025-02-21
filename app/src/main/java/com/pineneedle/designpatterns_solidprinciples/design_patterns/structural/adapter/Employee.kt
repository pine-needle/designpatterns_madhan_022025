package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.adapter

class Employee(
    val firstName: String,
    val lastName: String,
    val salary: Int
) {
    fun doWork(){
        println("employee is doing work")
    }
}