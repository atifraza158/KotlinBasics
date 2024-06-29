package com.example.first_application

public class MyClass {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            // Variables and Data types
//            var a: Int;
//            var b: Int;
//            var sum: Int;
//            var name: String;
//            a = 5;
//            b = 6;
//
//            sum = a + b;
//            println(sum);
//            name = "Dev"
//            println("Hello World $a");
//            println("I'm an android $name");
//            println("Two Parameters Sum Method: ${sum(2, 2)}");
//            println("Three Parameters Sum Method: ${sum(2, 2, 7)}");

            var marks: Int = 88;
            var msg = "";


            // if-else Conditions...
            msg = if (marks > 100) "Number is Greater than 100" else "Number is Okay"
            println(msg);

            if (marks <= 100 && marks >= 90) {
                println("A Grade");
            } else if (marks < 90 && marks >= 80) {
                println("B Grade");
            } else if (marks >= 70 && marks < 80) {
                println("C Grade");
            }
            else {
                println("Fails");
            }

            // When Condition, Replacement of Switch Case
            when {
                marks<=100 && marks >= 90 -> {
                    println("A Grade");
                }
                marks >= 80 && marks < 90 -> {
                    println("B Grade");
                }
                marks >= 70 && marks < 80 -> {
                    println("C Grade");
                }
            }


        }

        // Functions & Methods
       fun sum(a: Int, b: Int) : Int {
            return a+b;
       }

       fun sum(a: Int, b: Int, c: Int) : Int {
            return a+b+c;
       }


    }
}