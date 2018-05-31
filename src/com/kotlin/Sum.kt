/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package com.kotlin

fun sum(a: IntArray): Int {
    // Write your solution here
    var result : Int = 0;
    for(i in a) result += i
    return result
}


