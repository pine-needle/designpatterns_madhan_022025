package com.pineneedle.designpatterns_solidprinciples.solid_principles.SRP

// this class is responsible for database operations
class DatabaseService {

    fun openConnection() = println("connected to database")

    fun closeConnection() = println("disconnected to database")

    fun uploadToDatabase(file: FileService) = println("file uploaded to database")

    fun downloadFromDatabase(fileName: String) = println("file downloading from database -- $fileName")
}