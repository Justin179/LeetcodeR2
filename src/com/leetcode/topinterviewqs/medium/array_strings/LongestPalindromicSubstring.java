package com.leetcode.topinterviewqs.medium.array_strings;

public class LongestPalindromicSubstring {

     int left = 0;
     int maxLength = 0;
    public  String longestPalindrome(String s) {
        if (s.length()==0)
            return "";

        for (int i = 0; i<s.length(); i++){ // babad
            isPalindromFromCenter(s,i,i);
            isPalindromFromCenter(s,i,i+1);
        }

        return s.substring(this.left,this.left+maxLength);
    }

    private  void isPalindromFromCenter(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            if ((right-left+1)>maxLength) {
                this.left = left;
                maxLength = right-left+1;
            }
            left--;
            right++;
        }
    }


}
