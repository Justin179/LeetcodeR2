package com.leetcode.topinterviewqs.medium.array_strings;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColumnZero = false;
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        for (int i = 0; i<columnLength; i++){
            if(matrix[0][i] == 0)
                firstRowZero = true;
        }
        for (int i = 0; i<rowLength; i++){
            if (matrix[i][0] == 0)
                firstColumnZero = true;
        }
        for (int i = 1; i<rowLength; i++){
            for (int j = 1; j<columnLength; j++){
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // 上排
        for (int i = 1; i<columnLength; i++){
            if (matrix[0][i] == 0){
                for (int j = 1; j<rowLength; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        // 左排
        for (int i = 1; i<rowLength; i++){
            if (matrix[i][0] == 0){
                for (int j = 1; j<columnLength; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero){
            for (int i = 0; i<columnLength; i++){
                matrix[0][i] = 0;
            }
        }
        if (firstColumnZero){
            for (int i = 0; i<rowLength; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
