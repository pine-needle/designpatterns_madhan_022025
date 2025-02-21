package com.pineneedle.designpatterns_solidprinciples.solid_principles.DIP

class FuelApiRepository: UserRepository {
    override fun getUser() {
        println("getting users data using -- fuel")
    }
}