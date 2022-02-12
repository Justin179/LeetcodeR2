package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MFTest {
    @Test
    void testMF(){
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        assertEquals(1, MF.mostFreqentNum(array1));

        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        assertEquals(3, MF.mostFreqentNum(array2));

        // mostFrequent(array3) should return null.
        int[] array3 = {};
        assertEquals(null, MF.mostFreqentNum(array3));

        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        assertEquals(0, MF.mostFreqentNum(array4));

        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        assertEquals(-1, MF.mostFreqentNum(array5));
    }
}