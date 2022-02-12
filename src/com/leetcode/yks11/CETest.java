package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CETest {

    @Test
    void testCE(){
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).
        assertArrayEquals(new Integer[]{1,4,9}, CE.findCommonElements(array1A,array2A));

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
        assertArrayEquals(new Integer[]{1, 2, 9, 10, 12}, CE.findCommonElements(array1B,array2B));

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        assertArrayEquals(new Integer[]{}, CE.findCommonElements(array1C,array2C));
    }
}