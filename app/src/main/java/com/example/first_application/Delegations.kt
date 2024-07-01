package com.example.first_application

fun main() {
    println("Kotlin Delegations...")
    val fileName: String = "File1.mkv"
    val mediaFile = MediaFile(FileDownloader(fileName), FilePlayer(fileName));
    mediaFile.download()
    mediaFile.play()
}

interface Downloader {
    fun download()
}

interface Player {
    fun play()
}

class MediaFile(private val downloader: Downloader, private val player: Player) :
    Downloader by downloader, Player by player

class FileDownloader(private val file: String) : Downloader {
    override fun download() {
        println("$file is Downloading");
    }
}

class FilePlayer(private val file: String) : Player {
    override fun play() {
        println("$file is Playing");
    }

}