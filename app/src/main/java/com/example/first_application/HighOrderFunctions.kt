package com.example.first_application

fun main() {
    println("High Order Functions");
    highOrder(23, 80, printMe);
    highOrder2(22, 22, addMethod);
    highOrder3(5, 5, addMethod);

    val obj = HighClass(printMe);

}

val printMe = { println("This Line has been printed!") };
val addMethod: (Int, Int) -> Int = {a, b -> a + b};
val retString: (Int, Int) -> String = {a, b -> "The Sum is ${a+b}"};

// A High Order Function which accepts a functions as an Argument
fun highOrder(a: Int, b: Int, myFunc: () -> Unit) {
    println("A: $a")
    println("B: $b")
    myFunc();
}

fun highOrder2(x: Int, y: Int, func: (Int, Int) -> Int) {
    println("Sum: ${func(x, y)}");
}

// A High Order Function Accepting a function as an argument and return it...
fun highOrder3(a: Int, b: Int, func: (Int, Int) -> Int): (Int, Int) -> String {
    println(func(a, b))
    return retString;
}

// High Order Class
class HighClass(func: () -> Unit) {
    init {
        func();
    }
}