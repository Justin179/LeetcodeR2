package com.leetcode.btbswe.searchamaze;


import java.util.Arrays;

public class Solution4 {
    private int[] rowDir;
    private int[] colDir;
    private int[][] MAZE;
    private int rowLen;
    private int colLen;
    private int[] dest;
    private boolean res;
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {

        rowDir = new int[]{-1, 1, 0, 0}; // 上下 u d l r

        colDir = new int[]{0, 0, -1, 1}; // 左右 u d l r

        MAZE = maze;
        rowLen = maze.length;
        colLen = maze[0].length;
        dest = destination;
        res = false;

        // doesn't care the initial direction parameter
        dfs(-1, start, new boolean[rowLen][colLen]);
        return res;
    }

    private void dfs(int dir, int[] start, boolean[][] visited) {

        int currRow = start[0], currCol = start[1];

        // 找到時(curr = target) return
        if (Arrays.equals(start, dest)) {
            res = true;
            return;
        }

        // 走過時 return
        if (visited[currRow][currCol]) return;

        // 當前 標記為走過
        visited[currRow][currCol] = true;

        // up down left right
        for (int i = 0; i < 4; ++i) { // 0 1 2 3 轉4次 (依序為 上 下 左 右)


            if (i == dir) continue; // skip the direction that will hit the wall again

            int x = currRow, y = currCol;

            while (isValid(new int[]{x + rowDir[i], y + colDir[i]})) {
                x += rowDir[i];
                y += colDir[i];
            }

            dfs(i, new int[]{x, y}, visited);
        }

    }

    // return true if the coord is valid and maze[coord] == 0;
    private boolean isValid(int[] coord) {
        int r = coord[0];
        int c = coord[1];
        // 出界
        if (r < 0 || r >= rowLen || c < 0 || c >= colLen) return false;
        // 遇到牆
        if (MAZE[r][c] == 1) return false;
        return true;
    }
}
