package com.example.first_application

class TriplePairClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hey! Kotlin Folks");

            // Pair
//            val (name, age) = Pair("Atif Raza", 24);
//            println("$name: $age");
//            val name = Pair("Atif Raza", 24);
//            println("${name.first}: ${name.second}");

            val data = Pair("Atif Raza", Pair("Aqib Akram", Pair("Azeem", 27)));
            println("${data.second.second.first}: ${data.second.second.second}")

            val triple_data = Triple("Atif", Triple("A", "B", Pair("One", Triple(1, 2, 3))), "Aqib");
            println("${triple_data.third}: ${triple_data.second.third.second.second}");

        }
    }
}