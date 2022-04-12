package com.ubiquiti;

import java.util.Stack;

public class Q3_p1 {
    public static void main(String[] args) { // lc 316
        String s = "bcabc";
        s = "bbcaac";
        String res = removeDuplicateLetters(s);
        System.out.println(res); // bac
    }

    public static String removeDuplicateLetters(String s) {
        int[] counter = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars){
            counter[c-'a']++;
        }

        boolean[] used = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<chars.length; i++){ // bcabc

            if (used[chars[i]-'a']){
                counter[chars[i]-'a']--;
                continue;
            }
            used[chars[i]-'a'] = true;

            while (!stack.isEmpty() && stack.peek() > chars[i] && counter[stack.peek()-'a']>0){
                char temp = stack.pop();
                used[temp-'a'] = false;
            }

            stack.push(chars[i]);
            counter[chars[i]-'a']--;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack){
            sb.append(c);
        }
        return sb.toString();
    }



}
