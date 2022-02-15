package com.leetcode.yks11;

public class R2 {

    public static int[][] rotate(int[][] a, int n) {
        int[][] newArr = new int[n][n];
        for(int i = 0; i<n; i++){ // row index
            for (int j = 0; j<n; j++) { // col index
                int newRowI = j;
                int newColI = n-1-i;
                newArr[newRowI][newColI] = a[i][j];
            }
        }
        return newArr;
    }

    // Implement your solution below.
//    public static int[][] rotate(int[][] a, int n) {
//        int[][] rotated = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                rotated[j][n - 1 - i] = a[i][j];
//            }
//        }
//        return rotated;
//    }
}

