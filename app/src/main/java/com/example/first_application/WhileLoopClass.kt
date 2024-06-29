package com.example.first_application

class WhileLoopClass {
    companion object {
        @JvmStatic
        fun  main(args: Array<String>) {
            println("Hello Kotlin Devs....")
            var num: Int = 0;
            // While Loop
            while (num <= 10) {
               println("Number is: $num");
                num++;
            }

            // Do-While Loop
            do {
                println("Number is: $num");
                num++;
            } while (num >= 0 && num <= 20);

        }
    }
}