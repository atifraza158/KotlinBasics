package com.example.first_application

fun main() {
    println("Hello World of Maps in Kotlin(kt)")

    val studentDetails = mapOf<Any, Any>(
        "Name" to "Atif",
        "Age" to 24,
        "isPassed" to true,
    )

    val personDetails = mutableMapOf<Any, Any>(
        1 to "Atif",
        2 to 24,
        3 to true,
    );

    personDetails[4] = "Usman"
    personDetails.putAll(studentDetails)
    personDetails["Name"] = "Aqib"

    println(studentDetails["Name1"])
    println(personDetails)
}