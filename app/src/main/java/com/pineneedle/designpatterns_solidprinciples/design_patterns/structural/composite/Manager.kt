package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.composite

class Manager(val name: String, val designation: String = "manager") : Employee {
    override fun printEmployeeDetails() {
        println("name=$name, designation=$designation")
    }
}