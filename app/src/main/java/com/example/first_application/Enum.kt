package com.example.first_application

fun main() {
    println("Here We'll learn about Enum Class")

    println("Today is ${Days.FRIDAY}");
    for (day in Days.entries) {
        if (day.holiday) {
            println("The Holiday is on $day")
        }
    }
}

enum class Days(var holiday: Boolean = false) {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY(true)
}

enum class Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH,
}

enum class Gender {
    MALE, FEMALE, OTHERS
}