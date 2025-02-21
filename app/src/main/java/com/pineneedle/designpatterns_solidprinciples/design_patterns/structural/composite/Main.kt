package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.composite

fun main() {

    val developer1 = Developer("anirudh")
    val developer2 = Developer("usman")
    val developer3 = Developer("cena")

    val manager = Manager("saimon")

    val employeeList = EmployeeList()

    employeeList.addEmployee(Manager("adam"))
    employeeList.addEmployee(developer1)
    employeeList.addEmployee(developer2)
    employeeList.addEmployee(developer3)
    employeeList.addEmployee(manager)

    employeeList.printEmployeeDetails()
}