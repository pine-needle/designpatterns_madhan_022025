package com.pineneedle.designpatterns_solidprinciples.design_patterns.behavioral.command

fun main() {
    val tv = TV()

    val tvOnCommand = TVOnCommand(tv)
    val tvOffCommand = TVOffCommand(tv)
    val tvSetChannelCommand = TVSetChannelCommand(tv, 9)

    val remote = RemoteControl()

    remote.setCommand(tvOnCommand)
    remote.pressButton()

    remote.setCommand(tvSetChannelCommand)
    remote.pressButton()

    remote.setCommand(tvOffCommand)
    remote.pressButton()
}
