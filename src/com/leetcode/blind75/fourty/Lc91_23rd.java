package com.leetcode.blind75.fourty;

public class Lc91_23rd {
    /*
    Input: s = "226"
    Output: 3
    Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
     */
    public static void main(String[] args) {
        int res = numDecodings("226");
        System.out.println(res);
    }

    public static int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        return dfs(s,s.length(),dp);
    }

    // 226 2  -> 3-2 = 1
    private static int dfs(String data, int decodeRest, int[] dp){ // decodeRest -> numbers to look at
        // base cases
        // 要看(decode)的數字為零""，回傳1
        // 第一碼為零，回傳0
        if (decodeRest==0)
            return 1;
        if(data.charAt(data.length()-decodeRest)=='0')
            return 0;
        if (dp[decodeRest]!=0)
            return dp[decodeRest];

        int res = dfs(data,decodeRest-1,dp);
        int start = data.length()-decodeRest;
        if(decodeRest>=2 && Integer.parseInt(data.substring(start,start+2)) <=26)
            res += dfs(data,decodeRest-2,dp);

        dp[decodeRest] = res;

        return res;
    }
}














