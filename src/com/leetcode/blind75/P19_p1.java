package com.leetcode.blind75;

import java.util.Arrays;
import java.util.List;

public class P19_p1 { // 139
    public static void main(String[] args) {
        String s = "code";
        List<String> wordDict = Arrays.asList("c","od","e","x");
        boolean res = wordBreak(s,wordDict);
        System.out.println(res);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int len = 1; len<=s.length(); len++){
            for (int i = 0; i<len; i++){
                if (dp[i] && wordDict.contains(s.substring(i,len))){
                    dp[len] = true;
                }
            }
        }

        return dp[s.length()];
    }
}













