package com.leetcode.picp50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPairTest {

    @Test
    void findPair() {
        int[] arr = new int[]{4, 5, 1, -3, 6};
        int k = 11;
        assertEquals(true, FindPair.findPair(arr,k));

        int k2 = -2;
        assertEquals(true, FindPair.findPair(arr,k2));

        int k3 = 8;
        assertEquals(false, FindPair.findPair(arr,k3));
    }
}