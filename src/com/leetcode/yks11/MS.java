package com.leetcode.yks11;

public class MS {

    // int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
        // 棋盤
        int[][] field = new int[numRows][numCols];
        // loop through bombs
        for(int[] bomb : bombs) {
            int rowIndex = bomb[0];
            int colIndex = bomb[1];
            field[rowIndex][colIndex] = -1;
            for(int i = rowIndex-1; i<=rowIndex+1; i++){
                for(int j = colIndex-1; j<=colIndex+1; j++){
                    if(i>=0 && j>=0 && i<numRows && j<numCols && field[i][j]!=-1){ // 界內且不為-1
                        field[i][j] += 1;
                    }
                }
            }
        }


        return field;
    }

    // Implement your solution below.
//    public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
//        // 棋盤
//        int[][] field = new int[numRows][numCols];
//        // int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
//        for (int[] bomb: bombs) { // each bomb
//            int rowIndex = bomb[0];
//            int colIndex = bomb[1];
//            field[rowIndex][colIndex] = -1; // 標記炸彈為-1
//            for(int i = rowIndex - 1; i < rowIndex + 2; i++) {
//                for (int j = colIndex - 1; j < colIndex + 2; j++) {
//                    if (0 <= i && i < numRows &&
//                            0 <= j && j < numCols &&
//                            field[i][j] != -1) {
//                        field[i][j] += 1;
//                    }
//                }
//            }
//        }
//        return field;
//    }
}
