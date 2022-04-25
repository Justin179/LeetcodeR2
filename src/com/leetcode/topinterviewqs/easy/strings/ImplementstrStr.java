package com.leetcode.topinterviewqs.easy.strings;

public class ImplementstrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        haystack = "mississippi";
        needle = "issipi";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }


    public static int strStr(String haystack, String needle) {
        if (needle.length()==0)
            return 0;
        if (needle.length()>haystack.length())
            return -1;

        int needle_len = needle.length(); // 1
        char needleFirstChar = needle.charAt(0); // a
        for (int i = 0; i < haystack.length(); i++) { // 0
            if (haystack.charAt(i) == needleFirstChar && haystack.length()-i >= needle_len ) {
                String temp = haystack.substring(i, i + needle_len);
                if (temp.equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
