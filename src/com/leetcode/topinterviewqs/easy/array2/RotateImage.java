package com.leetcode.topinterviewqs.easy.array2;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i<n; i++){ // 0 1 2 -> rows (top to bottom)
            int left = 0;
            int right = n-1;
            while (left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
