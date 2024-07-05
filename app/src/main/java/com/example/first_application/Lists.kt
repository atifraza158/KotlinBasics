package com.example.first_application

fun main() {
    println("Kotlin Collections")

    // immutable List
    val array = listOf("Atif", "Aqib", "Ali", "Azeem")

    val names = mutableListOf<Any>("Atif",   "Aqib", "Ali", "Azeem", "")
    names[4] = "Bhai"
    names.add(2)
    names.add(0, "Ahmar")

    names.addAll(array)
    println(array)
    println()
    println(names)
}