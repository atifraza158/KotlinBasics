package com.example.first_application

fun main() {
    println("Abstraction");
}

interface MyInterface {
    var name: String;

    fun add(a: Int, b: Int) : Int {
        return a + b;
    }
}

// Abstract Class can have abstract and non-abstract data members & member functions...
abstract class AbClass {
    // Abstract and Non-Abstract Properties
    var name = "John";
    abstract var branch : String

    // Abstract Methods
    abstract fun myFunc()
    abstract  fun operate(a: Int, b: Int) : Any

    // Non-Abstract Methods
    open fun add(a: Int, b: Int) : Int {
        return  a + b;
    }
}


class KotlinClass : AbClass() {
    override var branch: String = "Git Branch"

    override fun myFunc() {
        println("This is an Abstract Overridden Method in Kotlin Class")
    }

    override fun operate(a: Int, b: Int): Any {
        return a + b;
    }

    override fun add(a: Int, b: Int): Int {
        return super.add(a, b)
    }
}

class iClass : MyInterface {
    override var name: String = "Jaun Eliya";

    override fun add(a: Int, b: Int): Int {
        return super.add(a, b)
    }

}




