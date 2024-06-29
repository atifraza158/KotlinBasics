package com.example.first_application

class ObjectsOfClasses {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kb = KotlinBasics(180);
//            val fb = FlutterBasics(45, 230, 8.08f);
            val fb2 = FlutterBasics();

            FlutterBasics.myFun2();

            fb2.myFun();

            println(FlutterBasics.name);
            println("The integer value is ${kb.someInt}")
            println("Sum: ${kb.sum(25, 3)}")
        }
    }

}

// primary Constructor also parameterised Constructor
// a primary constructor could only be one
class KotlinBasics constructor(private val a: Int) {
    init {
        println("We are getting: $a");
    }
    var someInt = 10;

    fun sum(a: Int, b: Int) : Any {
        return  a + b;
    }
}

// Custom or Secondary constructor
// By Default the primary constructor is called if it is defined
class FlutterBasics {
    constructor(a: Int) {
        println("Single Parameter Constructor: $a");
    }

    // Default Parameterized Constructor
    constructor(b: Int = 100, c: Int = 20) {
        println("Double Parameter Constructor: $b, $c");
        val sum = b + c;
        println("The Sum: $sum");
    }
    constructor(b: Int, c: Int, d: Int) {
        println("Three Parameter Constructor: $b, $c, $d");
    }
    constructor(b: Int, c: Int, d: Float) {
        println("Three Parameter Constructor With Float: $b, $c, $d");
    }

    fun myFun() {
        println("This is My function")
    }


    // This would be static data members
    companion object {
        val name = "Atif Raza";
        fun myFun2() {
            println("This is Static Function");
        }
    }

}
