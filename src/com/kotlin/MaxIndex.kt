/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */

package com.kotlin

fun indexOfMax(a: IntArray): Int? {
    return a.withIndex()
            .maxWith(Comparator { o1, o2 ->
                if(o1.value == o2.value) o1.index - o2.index else o1.value - o2.value
            })?.index
}