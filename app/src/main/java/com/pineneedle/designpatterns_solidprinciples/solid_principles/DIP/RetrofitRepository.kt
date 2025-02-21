package com.pineneedle.designpatterns_solidprinciples.solid_principles.DIP

class RetrofitRepository: UserRepository {
    override fun getUser() {
        println("getting users data using -- retrofit")
    }
}