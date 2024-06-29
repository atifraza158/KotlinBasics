package com.example.first_application

fun main() {
    println("Hello Kotlin Developers...");
    val audi = Audi("A3");
    audi.interior(1290);
}

open class Car {
    var manufacturerNo = 1010;
    open fun pressBrakes() : String {
        println("Press Brakes of Car");
        return "Press Brakes";
    }
    open fun pressAccelerator(speed: Int) : String {
        println("Car Accelerated With $speed KM/H speed");
        return  "Car Accelerated!";
    }

    open fun changeGear(gear: Int) : String {
        println("Gear Changed With $gear");
        return  "Gear Changed";
    }
}


class Audi(carModel: String) : Car() {
   var chassisNo = 101010;

    init {
        println("Object Created of Audi Class");
        println("Car Model: $carModel");
        println("Audi Created with ${super.manufacturerNo}")
        println("Step1: ${super.changeGear(1)}");
        println("Step2: ${super.pressAccelerator(10)}");
        println("Step3: ${super.changeGear(2)}");
        println("Step4: ${super.pressBrakes()}");
    }

    fun interior (chassisNo: Int) {
        println("Chassis No: ${this.chassisNo}");
        println("Chassis No: $chassisNo");
    }
}