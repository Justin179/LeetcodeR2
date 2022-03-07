package com.leetcode.picp50;

public class P36 {
    //      a c e x (text2)
    //    a
    //    b
    //    c
    //    d
    //    e
    //    x       x -> goal
    public int longestCommonSubsequence(String text1, String text2) { // "abcde" "ace"
        int n = text1.length(); // 5
        int m = text2.length(); // 3
        int[][] matrix = new int[n+1][m+1];
        for(int i = 0; i<n; i++){ // 0 1 2 3 4
            for(int j = 0; j<m; j++){ // 0 1 2
                // i = 0, j = 0 1 2
                char c1 = text1.charAt(i);
                char c2 = text2.charAt(j);
                if(c1==c2){
                    matrix[i+1][j+1] = 1 + matrix[i][j];
                }else {
                    matrix[i+1][j+1] = Math.max(matrix[i][j+1],matrix[i+1][j]);
                }
            }
        }
        return matrix[n][m];
    }
}
