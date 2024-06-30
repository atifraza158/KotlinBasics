package com.example.first_application

fun main() {
    println("Lambda Expressions/Functions");

    println("The Square of 2: ${square(2)}");
    println("Lambda Expression Square: ${sqr(5)}")
    println("Additions: ${add(5,10)}")
    printName("Atif Raza");
    printName2("Aqib Akram");

    devs()
}

fun square(a: Int) : Int {
    return  a*a;
}


// Lambda Functions... OR Lambda Expressions...
val sqr = {x: Int -> x*x};
val printName = {name: String -> println("Hello, $name")}

// if lambda expression does not return anything, then....
val printName2: (String) -> Unit = {name -> println("Hello, $name")}
val devs = {println("Hello Developers")};
val add: (Int, Int) -> Int = {a,b -> a + b};
//val sqr: (Int) -> Int = {x -> x*x};