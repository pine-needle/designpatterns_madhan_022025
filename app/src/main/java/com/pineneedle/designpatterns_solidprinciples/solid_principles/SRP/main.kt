package com.pineneedle.designpatterns_solidprinciples.solid_principles.SRP

fun main() {

    val databaseOperations = DatabaseService()

    databaseOperations.openConnection()

    databaseOperations.downloadFromDatabase("index.html")

    // need file service dependency
    databaseOperations.uploadToDatabase(FileService())

    databaseOperations.closeConnection()
}