package com.leetcode.blind75;

public class P18_p1 { // lc 1143
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int res = longestCommonSubsequence(text1,text2);
        System.out.println(res);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(); // 5
        int m = text2.length(); // 3
        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i>=0; i--){
            for (int j = m-1; j>=0; j--){
                if (text1.charAt(i) == text2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}
