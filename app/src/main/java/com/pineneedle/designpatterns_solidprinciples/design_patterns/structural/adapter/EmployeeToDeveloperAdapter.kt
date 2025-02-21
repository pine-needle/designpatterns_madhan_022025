package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.adapter

class EmployeeToDeveloperAdapter(private val employee: Employee) {
    fun convertToDeveloper(): Developer{
        return Developer(employee.firstName, employee.lastName, employee.salary)
    }
}