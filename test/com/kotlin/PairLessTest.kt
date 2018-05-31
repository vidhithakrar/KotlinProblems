package com.kotlin

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class PairLessTest {
    @Test
    fun testPairless1() {
        test(0, 0)
    }

    @Test
    fun testPairless2() {
        test(1, 0, 1, 0)
    }

    @Test
    fun testPairless3() {
        test(5, 5, -1, -1, 0, 0)
    }

    @Test
    fun testPairless4() {
        test(3, 1, 3, 1, 1, 1)
    }

    @Test
    fun testPairless5() {
        test(1, 2, 3, 1, 2, 3)
    }

}

private fun test(expected: Int?, vararg data: Int) {
    val actual = findPairless(data)
    assertEquals(expected, actual, "\ndata = ${Arrays.toString(data)}")
}