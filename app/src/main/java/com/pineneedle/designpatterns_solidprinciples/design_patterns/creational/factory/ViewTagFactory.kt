package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.factory

class ViewTagFactory private constructor(){
    companion object{
        fun createViewTag(viewTagName: String): ViewTag{
            return when(viewTagName){
                "text" -> TextViewTag()
                "button" -> ButtonViewTag()
                "checkbox" -> CheckBoxViewTag()
                else -> TextViewTag()
            }
        }
    }
}