package com.leetcode.debugzone;

public class CharArrToString {
    public static void main(String[] args) {
        String temp = "0000";
        char[] charArr = temp.toCharArray();
        System.out.println(charArr.toString()); // [C@776ec8df
        System.out.println(new String(charArr)); // 0000
    }
}
