package com.example.helloworld

class q1{
    fun main(){
        println("Enter a number: ")
        var a:Int = readLine().toString().toInt()
        if(a>0)
            println("$a is Positive")
        else
            println("$a is negative")
    }
}