package com.pineneedle.designpatterns_solidprinciples.design_patterns.creational.builder

class TextViewTag private constructor(
    private val id: String,
    private val text: String?,
    private var color: String,
    private val padding: String?,
    private val margin: String?
){
    class Builder{
        private lateinit var id: String
        private var text: String? = null
        private var color: String = "black" // default value
        private var padding: String? = null
        private var margin: String? = null

        fun setId(id: String): Builder = apply { this.id = id }

        fun setText(text: String): Builder = apply { this.text = text }

        fun setColor(color: String): Builder = apply { this.color = color }

        fun setPadding(padding: String): Builder = apply { this.padding = padding }

        fun setMargin(margin: String): Builder = apply { this.margin = margin }

        fun build(): TextViewTag {
            return TextViewTag(id, text, color, padding, margin)
        }
    }

    override fun toString(): String {
        return "TextViewTag(id=$id, text=$text, color=$color, padding=$padding, margin=$margin)"
    }
}