package com.example.first_application

class Inheritance {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello Kotlin Developers...");

            val std = StudentClass();
            val person = PersonClass();
            println("Student Name is: ${std.name}");
            println("Person Name is: ${person.name}");
            println("The Square of Sum is From Student Class: " + std.add(2, 2));
            println("The Sum is From Person Class: ${person.add(2, 2)}");
        }
    }
}

open class PersonClass {
   open val name: String = "John";

   open fun add(a: Int, b: Int) : Int {
        return a + b;
    }
}

class StudentClass: PersonClass() {
    override val name: String = "Atif Raza"
    override fun add(a: Int, b: Int): Int {
        val sum = super.add(a, b);
        val sqr = sum * sum;
        return  sqr;
    }
}