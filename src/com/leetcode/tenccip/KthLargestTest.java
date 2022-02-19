package com.leetcode.tenccip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void findKthLargest() {

        int[] c1 = new int[]{3,2,1,5,6,4};
        assertEquals(5, KthLargest.findKthLargest(c1,2));

        int[] c2 = new int[]{3,2,3,1,2,4,5,5,6};
        assertEquals(4, KthLargest.findKthLargest(c2,4));
    }
}