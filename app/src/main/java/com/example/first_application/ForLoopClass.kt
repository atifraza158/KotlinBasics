package com.example.first_application

class ForLoopClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello Kotlin Developers...");
            val arrNo = ArrayList<Int>();
            arrNo.add(10);
            arrNo.add(45);
            arrNo.add(99);
            arrNo.add(120);
            arrNo.add(99);
            arrNo.add(22);
            arrNo.add(9901);

//            for (i in 0 until 10){
//                println("Number is: $i")
//            }

//            for (i in 0 .. 10){
//                println("Number is: $i")
//            }

//            for (i in 10 downTo 0 step 2){
//                println("Number is: $i")
//            }

            for (i in arrNo){
                println("Number is: $i")
            }
        }
    }

}