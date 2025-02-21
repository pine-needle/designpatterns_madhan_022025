package com.pineneedle.designpatterns_solidprinciples.solid_principles.LSP

class CoilLib: ImageLoadingLib {
    override fun setImageViewId() {
        println("setting image id using -- coil")
    }

    override fun setImageDescription() {
        println("setting image description using -- coil")
    }

    override fun loadImage() {
        println("loading image using -- coil")
    }
}