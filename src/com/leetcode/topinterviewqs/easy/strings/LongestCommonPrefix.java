package com.leetcode.topinterviewqs.easy.strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        strs = new String[]{"dog","racecar","car"};
        strs = new String[]{""};

        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==1)
            return strs[0];

        // flower, flow, flight
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i<strs.length-1; i++){
            String curr = strs[i];
            String next = strs[i+1];
            int j = 0;
            while ((j<curr.length()&&j<next.length()) && curr.charAt(j)==next.charAt(j)){
                j++;
            }
            minLength = Math.min(minLength,j);
        }

        if (minLength==0 || minLength==Integer.MAX_VALUE)
            return "";

        String str = strs[0];
        str = str.substring(0,minLength);

        return str;
    }
}
