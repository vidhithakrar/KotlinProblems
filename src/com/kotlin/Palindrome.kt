/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package com.kotlin

fun isPalindrome(s: String): Boolean {
    if(s.trim().isEmpty()) return true

    val charArray = s.chars().toArray()
    var i = 0
    var j = charArray.size - 1
    while (i < j) {
        if (charArray[i] != charArray[j])
            return false
        i++
        j--
    }
    return true
}

