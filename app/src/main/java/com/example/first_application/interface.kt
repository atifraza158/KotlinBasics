package com.example.first_application

fun main() {
    println("Hello Kotlin Developers...");
    val obj = ClassA();
    println("Sum: ${obj.add(10, 20)}");
    println("Division: ${obj.division(22, 7)}");
    println("Modules: ${obj.mod(10, 3)}");
}

interface Calculations {
    fun add(a: Int, b: Int) : Int
    fun sub(a: Int, b: Int) : Int
    fun mul(a: Int, b: Int) : Int
    fun division(a: Int, b: Int) : Double
    fun mod(a: Int, b: Int) : Float
}

class ClassA : Calculations {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun sub(a: Int, b: Int): Int {
        return a - b;
    }

    override fun mul(a: Int, b: Int): Int {
        return a * b;
    }

    override fun division(a: Int, b: Int): Double {
        return (a / b).toDouble();
    }

    override fun mod(a: Int, b: Int): Float {
        return (a % b).toFloat();
    }

}
