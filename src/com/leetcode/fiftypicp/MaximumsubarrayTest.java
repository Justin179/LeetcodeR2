package com.leetcode.fiftypicp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumsubarrayTest {

    @Test
    void maxSubArray() {
        assertEquals(6, Maximumsubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}