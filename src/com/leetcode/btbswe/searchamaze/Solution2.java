package com.leetcode.btbswe.searchamaze;


public class Solution2 {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        // visited 走過為true
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, start, destination, visited);
    }

    // is all about 當前 (either go deeper and back)
    public boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) {
        // 當前若走過，return false
        if (visited[start[0]][start[1]])
            return false;
        // 當前找到，return true
        if (start[0] == destination[0] && start[1] == destination[1])
            return true;
        // 當前，註記為走過了 (能到此表示，此格沒走過+此格沒找到)
        visited[start[0]][start[1]] = true;

        // 下一格的位置 (右左上下)
        int r = start[1] + 1, l = start[1] - 1, u = start[0] - 1, d = start[0] + 1;

        // 當r走至最右的空格時，因為符合條件，r會再++(再往右走一格)，所以進dfs前要手動回調一格
        // 右 while (沒出右邊界 && 右格為0)
        while (r < maze[0].length && maze[start[0]][r] == 0) // right
            r++;
        if (dfs(maze, new int[]{start[0], r - 1}, destination, visited))
            return true;

        while (l >= 0 && maze[start[0]][l] == 0) //left
            l--;
        if (dfs(maze, new int[]{start[0], l + 1}, destination, visited))
            return true;

        while (u >= 0 && maze[u][start[1]] == 0) //up
            u--;
        if (dfs(maze, new int[]{u + 1, start[1]}, destination, visited))
            return true;

        while (d < maze.length && maze[d][start[1]] == 0) //down
            d++;
        if (dfs(maze, new int[]{d - 1, start[1]}, destination, visited))
            return true;

        return false;
    }
}
