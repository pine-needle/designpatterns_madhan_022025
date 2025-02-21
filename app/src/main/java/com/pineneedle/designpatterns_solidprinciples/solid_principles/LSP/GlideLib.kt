package com.pineneedle.designpatterns_solidprinciples.solid_principles.LSP

class GlideLib: ImageLoadingLib {
    override fun setImageViewId() {
        println("setting image id using -- glide")
    }

    override fun setImageDescription() {
        println("setting image description using -- glide")
    }

    override fun loadImage() {
        println("loading image using -- glide")
    }
}