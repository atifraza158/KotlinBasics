package com.example.first_application

fun main() {
    println("Generics in Kotlin...")
    val obj = GenClass<String>("Atif Raza");
    val obj2 = GenClass<Int>(24);
    val obj3 = GenClass("Bs Computer Science");
}

// Generic Class With constructor
class GenClass<T>(value: T){
    init {
        println("The Value is: $value");
        checkType<T>(value);
    }
}

fun <T> checkType(text: T) {
    println("The Value We've Got: $text");
}
