package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.composite

class EmployeeList() : Employee {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee){
        employees.add(employee)
    }

    override fun printEmployeeDetails() {
        for(employee in employees){
            println(employee.printEmployeeDetails())
        }
    }

}