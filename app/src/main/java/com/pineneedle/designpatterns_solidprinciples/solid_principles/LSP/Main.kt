package com.pineneedle.designpatterns_solidprinciples.solid_principles.LSP

fun main() {

    // using glide
    var imageLoadingLib: ImageLoadingLib = GlideLib()

    imageLoadingLib.setImageViewId()
    imageLoadingLib.setImageDescription()
    imageLoadingLib.loadImage()

    // changing from glide to fresco
    imageLoadingLib = FrescoLib()

    imageLoadingLib.setImageViewId()
    imageLoadingLib.setImageDescription()
    imageLoadingLib.loadImage()

    // changing from fresco to coil
    imageLoadingLib = CoilLib()

    imageLoadingLib.setImageViewId()
    imageLoadingLib.setImageDescription()
    imageLoadingLib.loadImage()
}