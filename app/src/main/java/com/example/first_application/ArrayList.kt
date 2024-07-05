package com.example.first_application

fun main() {
    println("Arrays List")

    val namesList = ArrayList<String>()

    namesList.add("Atif")
    namesList.add("Aqib")
    namesList.add("Azeem")
    namesList.add("Ali")

    println(namesList[2])
    println("Size of Array List: " + namesList.size)
    namesList.remove("Atif")
    namesList.removeAt(1)

    println("Names: $namesList")
}