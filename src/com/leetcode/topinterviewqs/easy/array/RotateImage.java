package com.leetcode.topinterviewqs.easy.array;

public class RotateImage {
    public void rotate(int[][] matrix) {

        for (int i = 0; i< matrix.length; i++){
            for (int j = i; j< matrix[0].length; j++){
                 swap(i,j,matrix);
            }
        }

        // row by row, inward swap
        for (int i = 0; i< matrix.length; i++){ // 0 1 2
            int[] row = matrix[i];
            int left = 0;
            int right = row.length-1;
            while (left<=right){

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }


    }

    private void swap(int i, int j, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
