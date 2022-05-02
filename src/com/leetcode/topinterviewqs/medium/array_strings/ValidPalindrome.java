package com.leetcode.topinterviewqs.medium.array_strings;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }

    /*
    A - Z = 65 - 90    +32 變小
    a - z = 97 - 122
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<chars.length; i++){
            int currAscii = chars[i];
            if (currAscii>=65 && currAscii<=90){ // 此字元大寫
                char upperCase =  (char) (currAscii+32);
//                chars[i] = upperCase;
                sb.append(upperCase);
            } else if (currAscii>=97 && currAscii<=122){
                sb.append(chars[i]);
            } else if (Character.isDigit(chars[i])){
                sb.append(chars[i]);
            }
        }
        String newStr = sb.toString();
        char[] newChars = newStr.toCharArray();
        int left = 0;
        int right = newChars.length-1;
        while (left<=right){
            if (newChars[left] != newChars[right])
                return false;
            else {
                left++;
                right--;
            }
        }

        return true;
    }

}







