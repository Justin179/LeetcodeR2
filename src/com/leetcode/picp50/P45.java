package com.leetcode.picp50;

public class P45 {
    /*
    Input: str = "acbca bcbb"
    Output:  "bbcbacbca bcbb"
     */

    public static void main(String[] args) {
        String str = "acbcabcbb";
        String res = shortestPalindrome(str);
        System.out.println(res);
    }

    static String shortestPalindrome(String str){
        int startingPoint = 0;
        for (int i = 0; i<str.length(); i++){
            String leftToRight = str.substring(0,i+1);
            String rightToLeft = new StringBuilder(leftToRight).reverse().toString();
            if(leftToRight.equals(rightToLeft))
                startingPoint = i+1;
        }
        String prefix = new StringBuilder(str.substring(startingPoint)).reverse().toString();
        return prefix+str;
    }












//    static String shortestPalindrome(String str){
//        int mirrorLength = 0;
//        for(int i = 0; i <= str.length(); i++){
//            if(str.substring(0, i).equals(new StringBuilder(str.substring(0, i)).reverse().toString()))
//                mirrorLength = i;
//        }
//        return new StringBuilder(str.substring(mirrorLength)).reverse() + str;
//    }

}
