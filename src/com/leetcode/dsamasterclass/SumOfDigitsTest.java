package com.leetcode.dsamasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    @Test
    void findSumOfDigits() {
        assertEquals(1, SumOfDigits.findSumOfDigits(10));
        assertEquals(9, SumOfDigits.findSumOfDigits(54));
        assertEquals(4, SumOfDigits.findSumOfDigits(112));
        assertEquals(3, SumOfDigits.findSumOfDigits(111));
    }
}