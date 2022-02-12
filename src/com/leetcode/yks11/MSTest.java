package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MSTest {

    @Test
    void mineSweeper() {
        // NOTE: The following input values will be used for testing your solution.
        int[][] bombs1 = {{0, 2}, {2, 0}};
        // mineSweeper(bombs1, 3, 3) should return:
        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]
//        MS.mineSweeper(bombs1,3,3);
        int[][] expected = new int[][]{{0,1,-1},{1,2,1},{-1,1,0}};
        int[][] resArr = MS.mineSweeper(bombs1,3,3);
        assertArrayEquals(expected, resArr);

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]
        int[][] expected2 = new int[][]{{-1,-1,2,1},{2,3,-1,1},{0,1,1,1}};
        int[][] resArr2 = MS.mineSweeper(bombs2,3,4);
        assertArrayEquals(expected2, resArr2);

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
        int[][] expected3 = new int[][]{{1,2,2,1,0},{1,-1,-1,2,0},{1,3,-1,2,0},{0,1,2,2,1},{0,0,1,-1,1}};
        int[][] resArr3 = MS.mineSweeper(bombs3,5,5);
        assertArrayEquals(expected3, resArr3);
    }
}