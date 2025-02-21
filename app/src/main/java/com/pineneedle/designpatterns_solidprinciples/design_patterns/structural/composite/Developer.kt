package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.composite

class Developer( val name: String, val designation: String = "developer") : Employee {
    override fun printEmployeeDetails() {
        println("name=$name, designation=$designation")
    }
}