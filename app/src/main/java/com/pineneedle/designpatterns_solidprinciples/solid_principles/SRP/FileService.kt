package com.pineneedle.designpatterns_solidprinciples.solid_principles.SRP

// this class is responsible for file operations
class FileService {

    fun createFile() = println("file created")

    fun deleteFile() = println("file deleted")

    fun editFile() = println("editing the file")

    fun saveFile() = println("saving the changes in the file")
}