package com.pineneedle.designpatterns_solidprinciples.solid_principles.DIP

fun main() {

    // current retrofit
    var repo: UserRepository = RetrofitRepository()
    repo.getUser()

    // future may be fuel but the output will be same
    repo = FuelApiRepository()
    repo.getUser()
}