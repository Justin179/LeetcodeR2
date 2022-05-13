package com.leetcode.topinterviewqs.easy.strings2;

public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int res = strStr(haystack,needle);
        System.out.println(res);
    }
    public static int strStr(String haystack, String needle) {
        if (needle.trim().length()==0)
            return 0;

        char firstChar = needle.charAt(0);
        int needleLen = needle.length(); // 2

        char[] chars = haystack.toCharArray();
        for (int i = 0; i< chars.length; i++){
            if (chars[i]==firstChar && (i+needleLen <= haystack.length())){
                String subStr = haystack.substring(i,i+needleLen);
//                System.out.println(subStr);
                if (subStr.equals(needle))
                    return i;
            }
        }


        return -1;
    }
}
