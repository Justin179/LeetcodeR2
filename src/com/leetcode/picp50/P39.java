package com.leetcode.picp50;

public class P39 {
    /*
    Input: str1 = "opposite", str2 = "position"
    Output: 5
    Explanation: the longest common substring of str1 and str2 is "posit"
     */
    public static void main(String[] args) {
        String str1 = "opposite", str2 = "position";

        int res = lcs(str1,str2);
        System.out.println(res);
    }
    static int lcs(String str1, String str2){
        int n = str1.length()+1;
        int m = str2.length()+1;
        int[][] matrix = new int[n][m];
        int max = 0;
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                    if(matrix[i][j]>max)
                        max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
