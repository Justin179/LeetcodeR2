package com.leetcode.picp50;

public class PathsInMatrix {

    // backtrack problem
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}};
        int paths = paths(matrix);
        System.out.println(paths); // 4
    }

    static int paths(int[][] matrix){
        return paths(matrix, 0, 0);
    }

    static int paths(int[][] matrix, int row, int col){ // row col
        int n = matrix.length;
        int m = matrix[0].length;
        if(row>n-1 || col>m-1 || matrix[row][col] == 1){ // 出界或撞牆或起點即撞牆 (出界的case要先寫，不然matrix有可能會接到出界的值)
            return 0;
        } else if(row==n-1 && col==m-1){
            return 1;
        } else {
            return paths(matrix,row+1,col) + paths(matrix,row,col+1);
        }
    }

    /*
        出界 / 遇牆 return 0
        到終點 return 1
        每一格，都先向下走直到沒路，再向右走直到沒路
     */
//    static int paths(int[][] matrix, int row, int col){ // row col
//        int n = matrix.length; // row length
//        int m = matrix[0].length; // column length
//        if(row > n-1 || col > m-1 || matrix[row][col] == 1) // 出邊界 or 遇牆時
//            return 0;
//        else if(row == n-1 && col == m-1) // 到終點了
//            return 1;
//        else
//            return paths(matrix, row+1, col) + paths(matrix, row, col+1);
//    }
}
