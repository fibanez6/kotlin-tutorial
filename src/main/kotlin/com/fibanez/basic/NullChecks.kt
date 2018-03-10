/**
 * A reference must be explicitly marked as nullable to be able hold a null.
 * See http://kotlinlang.org/docs/reference/null-safety.html#null-safety
 */
package com.fibanez.basic

fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("One of the arguments isn't Int")
    }
    return null
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("No number provided")
    } else {
        val x = parseInt(args[0])
        val y = parseInt(args[1])

        // We cannot say 'x * y' now because they may hold nulls
        if (x != null && y != null) {
            print(x * y)
        } else {
            println("One of the arguments is null")
        }
    }
}
