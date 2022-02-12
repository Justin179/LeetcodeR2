package com.leetcode.btbswe.searchamaze;

import java.util.LinkedList;
import java.util.Queue;

// 就用這個吧，至少有看懂
public class Solution6 {
    int [][] dirs = new int[][]{{-1, 0}, {1, 0}, {0,-1}, {0,1}};

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if(maze == null || maze.length == 0 || maze[0].length == 0){
            return false;
        }

        int m = maze.length;
        int n = maze[0].length;
        // 起點或終點出界了的話，return false
        if(start[0]<0 || start[0]>=m || start[1]<0 || start[1]>=n ||
                destination[0]<0 || destination[0]>=m || destination[1]<0 || destination[1]>=n){
            return false;
        }


        Queue<int []> que = new LinkedList<>();
        boolean [][] visited = new boolean[m][n];
        que.add(start);
        visited[start[0]][start[1]] = true;

        while(!que.isEmpty()){
            // 取出curr
            int [] cur = que.poll();
            // 找到回傳true 結束一切
            if(cur[0] == destination[0] && cur[1] == destination[1])
                return true;

            // curr走四方向 走到底
            for(int [] dir : dirs){ // 上 下 左 右
                //
                int currRowPos = cur[0];
                int currColPos = cur[1];
                // 界內且有路，走到最 上 下 左 右
                while(currRowPos+dir[0]>=0 && currRowPos+dir[0]<m
                        && currColPos+dir[1]>=0 && currColPos+dir[1]<n
                        && maze[currRowPos+dir[0]][currColPos+dir[1]]==0){
                    currRowPos += dir[0];
                    currColPos += dir[1];
                }

                // 沒來過就註記，然後加入que
                if(!visited[currRowPos][currColPos]){
                    visited[currRowPos][currColPos] = true;
                    que.add(new int[]{currRowPos, currColPos});
                }
            }
        }

        return false;
    }
}
