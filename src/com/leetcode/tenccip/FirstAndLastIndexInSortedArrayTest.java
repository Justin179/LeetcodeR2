package com.leetcode.tenccip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastIndexInSortedArrayTest {

    @Test
    void findFirstAndLastIndexInSortedArray() {
        assertArrayEquals(new int[]{2,6},
                FirstAndLastIndexInSortedArray.findFirstAndLastIndexInSortedArray(new int[]{2,4,5,5,5,5,5,7,9,9},5));
    }
}