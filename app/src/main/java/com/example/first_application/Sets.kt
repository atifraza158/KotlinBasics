package com.example.first_application

fun main() {
    val names = setOf("Atif", "Ahmar", 3, "Muneeb", "Usman", false, 3.6, 'A')
    val mNames = mutableSetOf<Any>("Atif", "Aqib", "Azeem", "Ali")

    mNames.add("Ansam")
    mNames.add(true)
    mNames.addAll(names)

    println("Immutable Names Set: $names")
    println("Mutable Names Set: $mNames")
}