package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MS2Test {

    @Test
    void click() {
        // NOTE: The following input values will be used for testing your solution.
        int[][] field1 = {  {0, 0, 0, 0, 0},
                            {0, 1, 1, 1, 0},
                            {0, 1, -1, 1, 0}};

        // click(field1, 3, 5, 2, 2) should return:
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]

        int[][] expected = new int[][]{{0, 0, 0, 0, 0},{0, 1, 1, 1, 0},{0, 1, -1, 1, 0}};
        assertArrayEquals(expected, MS2.click(field1,3,5,2,2));


        // click(field1, 3, 5, 1, 4) should return:
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]
        int[][] expected2 = new int[][]{{-2, -2, -2, -2, -2}, {-2, 1, 1, 1, -2}, {-2, 1, -1, 1, -2}};
        assertArrayEquals(expected2, MS2.click(field1,3,5,1,4));

        int[][] field2 = {  {-1, 1, 0, 0},
                            {1, 1, 0, 0},
                            {0, 0, 1, 1},
                            {0, 0, 1, -1}};

        // click(field2, 4, 4, 0, 1) should return:
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]
        int[][] expected3 = new int[][]{{-1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, -1}};
        assertArrayEquals(expected3, MS2.click(field2,4,4,0,1));

        // click(field2, 4, 4, 1, 3) should return:
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
        int[][] expected4 = new int[][]{{-1, 1, -2, -2}, {1, 1, -2, -2}, {-2, -2, 1, 1}, {-2, -2, 1, -1}};
        assertArrayEquals(expected4, MS2.click(field2,4,4,1,3));

    }
}