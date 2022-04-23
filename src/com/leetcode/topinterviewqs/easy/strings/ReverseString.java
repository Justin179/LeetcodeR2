package com.leetcode.topinterviewqs.easy.strings;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right]= temp;
            left++;
            right--;
        }
    }
}


/*
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s){
            sb.append(c);
        }
        char[] temp = sb.reverse().toString().toCharArray();
        for (int i = 0; i<temp.length; i++){
            s[i] = temp[i];
        }
    }
 */
