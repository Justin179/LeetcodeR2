package com.leetcode.btbswe.searchamaze;

public class Solution5 {
    // 方向: 上 下 左 右
    int [][] dirs = new int[][]{{-1, 0}, {1,0}, {0,-1}, {0,1}};
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if(maze == null || maze.length == 0 || maze[0].length == 0){
            return false;
        }

        int rowLen = maze.length;
        int colLen = maze[0].length;
        boolean [][] visited = new boolean[rowLen][colLen];
        visited[start[0]][start[1]] = true;

        for(int [] dir : dirs){ //
            if(dfs(maze, start, destination, dir, visited))
                return true;
        }

        return false;
    }

    private boolean dfs(int[][] maze, int[] start, int[] dest, int [] dir, boolean [][] visited){
        int rowLen = maze.length;
        int colLen = maze[0].length;

        int currRow = start[0];
        int currCol = start[1];

        // 找到即結束一切
        if(currRow == dest[0] && currCol ==dest[1])
            return true;

        // 邊界內 且 有路 (不受visited影響)，就一路走到最 上 / 下 / 左 / 右
        while(currRow+dir[0]>=0 && currRow+dir[0]<rowLen && currCol+dir[1]>=0 && currCol+dir[1]<colLen && maze[currRow+dir[0]][currCol+dir[1]]==0){
            currRow += dir[0];
            currCol += dir[1];
        }

        // 最後落腳處來過了
        if(visited[currRow][currCol])
            return false;

        // 沒來過，就註記現在來過了
        visited[currRow][currCol] = true;


        for(int [] nextDir : dirs){ // 上 下 左 右
            if(dfs(maze, new int[]{currRow,currCol}, dest, nextDir, visited)){
                return true;
            }
        }

        return false;
    }
}
