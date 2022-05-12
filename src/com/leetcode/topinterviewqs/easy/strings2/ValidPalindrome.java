package com.leetcode.topinterviewqs.easy.strings2;

public class ValidPalindrome {
    /*
    0-9 48-57
    a-z 97-122
    A-Z 65-90  -> +32變小
     */
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<chars.length; i++){
            int curr = chars[i];
            if ((curr>=97 && curr<=122)||(curr>=48 && curr<=57)){
                sb.append(chars[i]);
            }
        }
        s = sb.toString();

        int left = 0;
        int right = s.length()-1;
        chars = s.toCharArray();
        while (left<right){
            if (chars[left]!=chars[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}
















