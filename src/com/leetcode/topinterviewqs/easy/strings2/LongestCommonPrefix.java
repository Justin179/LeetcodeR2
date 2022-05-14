package com.leetcode.topinterviewqs.easy.strings2;

public class LongestCommonPrefix {

//    public static void main(String[] args) {
//        String str1 = "flower";
//        String str2 = "flow";
//        String str3 = "flight";
//        int res = longestPrefix(str2,str3);
//        System.out.println(res);
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==1)
            return strs[0];

        int min = Integer.MAX_VALUE;
        for (int i = 1; i<strs.length; i++){
            String str1 = strs[i-1];
            String str2 = strs[i];
            int longestPrefix = longestPrefix(str1,str2);
            min = Math.min(min,longestPrefix);
        }

        String res = strs[0].substring(0,min);
        return res;
    }

    private int longestPrefix(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int minLen = Math.min(chars1.length,chars2.length);

        int i = 0;
        while (i<minLen && chars1[i]==chars2[i]){
            i++;
        }
        return i;
    }
}
