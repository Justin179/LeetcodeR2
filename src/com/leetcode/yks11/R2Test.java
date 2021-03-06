package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R2Test {

    @Test
    void testR2(){
        // NOTE: The following input values will be used for testing your solution.
        int a1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        // rotate(a1, 3) should return:
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]
        int[][] expected = new int[][]{{7,4,1},{8,5,2},{9,6,3}};
        assertArrayEquals(expected, R2.rotate(a1,3));

        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        // rotate(a2, 4) should return:
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]
        int[][] expected2 = new int[][]{{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}};
        assertArrayEquals(expected2, R2.rotate(a2,4));
    }
}