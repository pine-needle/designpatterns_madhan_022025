package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.adapter

fun main() {

    val employee: Employee = Employee("robert", "henry", 1500)

    val adapter: EmployeeToDeveloperAdapter = EmployeeToDeveloperAdapter(employee)
    val developer: Developer = adapter.convertToDeveloper()

    println(developer.toString())
}