package com.leetcode.blind75.twenty;

public class P18 { // lc 1143
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
//        text1 = "abc";
//        text2 = "def";
        int res = longestCommonSubsequence(text1,text2);
        System.out.println(res);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] chars1 = text1.toCharArray(); // i
        char[] chars2 = text2.toCharArray(); // j
        int n = chars1.length;
        int m = chars2.length;
        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i>=0; i--){
            for (int j = m-1; j>=0; j--){
                if (chars1[i]==chars2[j])
                    dp[i][j] = 1 + dp[i+1][j+1];
                else
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }

        return dp[0][0];
    }
}
