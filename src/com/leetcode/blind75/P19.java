package com.leetcode.blind75;

import java.util.Arrays;
import java.util.List;

public class P19 {
    public static void main(String[] args) {
        String s = "code";
        List<String> wordDict = Arrays.asList("c","od","e","x");
        boolean res = wordBreak(s,wordDict);
        System.out.println(res);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length(); // 4
        boolean[] dp = new boolean[len+1];
        dp[0] = true;

        for (int right = 1; right<=len; right++){
            for (int i = 0; i<right; i++){
                if(dp[i] && wordDict.contains(s.substring(i,right))){
                    dp[right] = true;
                    break;
                }
            }
        }

        return dp[len];
    }
}













