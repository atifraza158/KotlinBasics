package com.example.first_application

import androidx.collection.IntIntMap

fun main() {
    val name: String = "Atif Raza";
    val age: Int = 24;
    val isPass: Boolean = true;
    val marks: Float = 99.99f;
    val percentage: Double = 99.99;

    val intMarks = marks.toInt()

    println("My name is $name and I am $age years old");
    if (isPass) {
        println("I've Successfully passed my exam...");
    } else {
        println("Unfortunately, I've Failed my Exam...")
    }

    println("My marks are $marks with the percentage of ${average(marks, 100)}%");

    var i = 1
    do {
        println("Counter Value: $i");
        i++;
    } while (i <= 5);

    when {
        marks >= 90 && marks <= 100 ->{
            println("A Grade");
        }
        marks >= 80 && marks < 90 -> {
            println("B Grade");
        }
        marks >= 70 && marks < 80 -> {
            println("C Grade");
        }
        marks >= 60 && marks < 70 -> {
            println("D Grade");
        }
        marks < 60 && marks >= 50 -> {
            println("Only Pass");
        }
        marks < 50 && marks >= 0 -> {
            println("You're Fail");
        }
        else -> {
            println("Invalid Marks");
        }
    }

    // Triple & Pair
    val pair_data = Pair(77, 90);
    val triple_data = Triple("Atif Raza", 24, "BSCS");
//    println("X: $x, Y: $y");
    println("Pair Data: ${pair_data.first} & ${pair_data.second}");
    println("Details of Student: name: ${triple_data.first}, age: ${triple_data.second}, course: ${triple_data.third}")

    println("Sum:  ${sum(20, 90)}");
    println("Average: ${average(892.0f, 1100)}");

    val person = Person("Aqib Akram", 26);
    person.personDetails();
    Person.my_func()

    val aqib = Student(120, 90);
}


fun sum(a: Int = 0, b: Int = 0) : Int {
    return a + b;
}

fun average(o_marks: Float, t_marks: Int) : Any {
    val avg = (o_marks / t_marks) * 100;
    return  avg;
}

// A Class with the primary constructor
class Person constructor(var person_name: String, var person_age: Int) {
    val name: String = person_name;
    val age: Int = person_age;

    // Another Constructor we can say.. Always call of Object creation
    init {
        println("Object Created of Person Class")
    }

    fun personDetails() {
        println("Person's Name is $name and his/her age is $age");
    }

    companion object {
        fun my_func() {
            println("This is my Static function");
        }
    }
}

// A Class with Secondary Constructor
class Student {
    init {
        println("Object Created of Student Class")
    }

//    constructor() {
//        println("This is same as Primary Constructor")
//    }

    constructor(a: Int = 0) {
        println("Here is the constructor with value of: $a");
    }

    constructor(a: Int, b: Int) {
        println("Constructor With Two values: $a $b");
    }
}