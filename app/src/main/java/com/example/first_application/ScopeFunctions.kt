package com.example.first_application

fun main() {

    val userName: String? = null
    val user2= User()
    user2.name = "Hoda"
    user2.age = 55

    val msg = user2.run {
        println("The name of Student is : $name")
        age
        "Run Scope Function"
    }

    println("Message is : $msg")
    // if the value of userName is empty then, it will not execute the body of it.
    userName?.let {
        println("UserName: ${it.length}")
        println("UserName: $it")
        println("Reversed UserName: ${it.reversed()}")
    }


    // Returns Context Object
    val user = User().apply { // Context Object
        name = "John Doe"
        this.age = 35
        mobile = "+92 300 1234567"
    }

    // Returns lambda result
    val age = with(user) {
        println("Name: $name")
        println("Age: ${this.age}")
        println("Mobile: $mobile")

        age
    }
    println("Age Of with Object: $age")

    // Also Object (it base)
    user.also {
        it.name = "Harry"
        println("The Name has Changed")
    }

    println("The User name becomes: ${user.name}")
    // println("The name of the User is: ${user.name}")
}

class User {
    var name = ""
    var age = 24
    var mobile = ""
}