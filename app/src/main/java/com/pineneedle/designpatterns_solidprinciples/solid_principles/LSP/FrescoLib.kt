package com.pineneedle.designpatterns_solidprinciples.solid_principles.LSP

class FrescoLib: ImageLoadingLib {
    override fun setImageViewId() {
        println("setting image id using -- fresco")
    }

    override fun setImageDescription() {
        println("setting image description using -- fresco")
    }

    override fun loadImage() {
        println("loading image using -- fresco")
    }
}