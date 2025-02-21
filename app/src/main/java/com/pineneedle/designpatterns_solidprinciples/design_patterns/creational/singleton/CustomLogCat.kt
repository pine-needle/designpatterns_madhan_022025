package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.singleton

class CustomLogCat private constructor(){

    private val logsList = mutableListOf<String>()

    fun log(message: String) = logsList.add(message)

    fun showLogs() = println(logsList)

    // forcing user to create instance by the below static method
    // and using static reference for the instance
    companion object{
        private var customLogCatInstance: CustomLogCat? = null

        fun getInstance(): CustomLogCat{
            if(customLogCatInstance == null){
                customLogCatInstance = CustomLogCat()
            }

            return customLogCatInstance!!
        }
    }

}