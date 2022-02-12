package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NRTest {
    @Test
    void testNR(){
        // NOTE: The following input values will be used for testing your solution.
        assertEquals('c', NR.nonRepeating("abcab")); // should return 'c'
        assertEquals(null, NR.nonRepeating("abab")); // should return null
        assertEquals('c', NR.nonRepeating("aabbbc")); // should return 'c'
        assertEquals('d', NR.nonRepeating("aabbdbc")); // should return 'd'
    }

}