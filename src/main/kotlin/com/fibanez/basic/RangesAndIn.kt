package com.fibanez.basic

/**
 * Check if a number lies within a range.
 * Check if a number is out of range.
 * Check if a collection contains an object.
 * See http://kotlinlang.org/docs/reference/ranges.html#ranges
 */

fun main(args: Array<String>) {
    val x = args[0].toInt()

    println("Check if a number lies within a range:")
    val y = 10
    if (x in 1..y - 1)
        println("OK")

    //or
    if (x in 1 until y - 1)
        println("OK")

    println("Iterate over a range")
    for (a in 1..5)
        print("${a} ")

    println()
    println("Check if a number is out of range:")
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size - 1) {
        println("Out: array has only ${array.size} elements. x = ${x}")
    }

    //or
    if (x !in 0 until array.size - 1) {
        println("Out: array has only ${array.size} elements. x = ${x}")
    }

    //Check if a collection contains an object:
    if ("aaa" in array) // collection.contains(obj) is called
        println("Yes: array contains aaa")

    if ("ddd" in array) // collection.contains(obj) is called
        println("Yes: array contains ddd")
    else
        println("No: array doesn't contains ddd")
}