package com.pineneedle.designpatterns_solidprinciples.design_patterns.structural.adapter

class Developer(
    val firstName: String,
    val lastName: String,
    val salary: Int
) {
    fun develop(){
        println("developer is developing app")
    }

    override fun toString(): String{
        return "Developer(firstName=$firstName, lastName=$lastName, salary=$salary)"
    }
}