package com.leetcode.hiskio.mytry;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Greedy_Maze_Cost_A {

    Integer[][] maze;           // cost lookup table
    PriorityQueue<Node> pq;     // explored nodes (sort by cost)
    Integer[][] maze_best;      // unexplored nodes (null) + confirmed nodes

    static class Node {
        Integer row;
        Integer col;
        Integer cost;

        public Node(Integer row, Integer col) {
            this.row = row;
            this.col = col;
        }
    }

    static class MyComp implements Comparator<Node> {

        @Override
        public int compare(Node node1, Node node2) {
            return node1.cost.compareTo(node2.cost); // low -> high
        }
    }

    public Greedy_Maze_Cost_A(Integer[][] maze) {
        this.maze = maze;
        this.pq = new PriorityQueue<>(20, new MyComp());
        this.maze_best = new Integer[this.maze.length][this.maze[0].length];
    }

    public int go_maze(int row_start, int col_start, int row_target, int col_target) {
        Node start = new Node(row_start, col_start);
        start.cost = this.maze[row_start][col_start];
        Node target = new Node(row_target, col_target);

        return go_maze(start, target);
    }

    public int go_maze(Node start, Node target) {
        pq.add(start);

        while (true){
            if(pq.size()==0)
                break;

            Node curr = pq.poll();

            if(maze_best[curr.row][curr.col]!=null)
                continue;

            // confirm current node
            maze_best[curr.row][curr.col] = curr.cost;

            // up
            if(curr.row-1 >= 0){
                Node up = new Node(curr.row-1,curr.col);
                up.cost = curr.cost + maze[curr.row-1][curr.col];
                pq.add(up);
            }
            // down
            if (curr.row+1 < maze.length){
                Node down = new Node(curr.row+1,curr.col);
                down.cost = curr.cost + maze[curr.row+1][curr.col];
                pq.add(down);
            }
            // left
            if(curr.col-1 >= 0){
                Node left = new Node(curr.row,curr.col-1);
                left.cost = curr.cost + maze[curr.row][curr.col-1];
                pq.add(left);
            }
            // right
            if(curr.col+1 < maze[0].length){
                Node right = new Node(curr.row,curr.col+1);
                right.cost = curr.cost + maze[curr.row][curr.col+1];
                pq.add(right);
            }

        }

        return maze_best[target.row][target.col];
    }

    public static void main(String[] args) {

        Integer[][] maze = new Integer[][] {
                {1,3,1,2,9},
                {7,3,4,9,9},
                {1,7,5,5,3},
                {2,3,4,2,5},
        };

        Greedy_Maze_Cost_A gmc = new Greedy_Maze_Cost_A(maze);

        int row_start = 0; int col_start = 0;
        int row_target = 3; int col_target = 4;

        int cost_min = gmc.go_maze(row_start, col_start, row_target, col_target);

        System.out.println(cost_min); // 25
    }

}
