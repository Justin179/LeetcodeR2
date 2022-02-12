package com.leetcode.btbswe.searchamaze;


public class Solution3 {
    // 上 下 左 右
    private int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, visited, start, destination);
    }

    private boolean dfs(int[][] maze, boolean[][] visited, int[] c, int[] des) {
        // 當前 走過
        if (visited[c[0]][c[1]]) return false;
        // 當前 找到
        if (c[0] == des[0] && c[1] == des[1]) return true;
        // 當前 註記走過
        visited[c[0]][c[1]] = true;
        boolean result = false;

        for (int[] d : dir) { // 上 下 左 右
            int x = c[0] + d[0];
            int y = c[1] + d[1];
            // 在 上下邊界 && 左右邊界 內 && 該格為空
            while ( 0 <= x && x < maze.length && 0 <= y && y < maze[0].length && maze[x][y] == 0) {
                // 產生新的當前，走到最 上 下 左 右
                x += d[0];
                y += d[1];
            }
            result = result || dfs(maze, visited, new int[]{ x - d[0], y - d[1]}, des);
        }

        return result;
    }
}
