package com.example.first_application

fun main() {
    println("Nullability in Kotlin")

    var name: String? = null
//    name = "Atif Raza"

    // println("My Name Length is: ${name!!.length}")
    // Scope Functions
    name?.let {
        println("My Name is: ${name}")
        println("My Name Length is: ${name.length}")

    }
}