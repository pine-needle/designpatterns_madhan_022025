package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

class TVSetChannelCommand(private val tv: TV, private val channel: Int) : Command {
    override fun execute() {
        tv.setChannel(channel)
    }
}
