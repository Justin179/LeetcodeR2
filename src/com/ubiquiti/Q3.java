package com.ubiquiti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Q3 {
    public static void main(String[] args) { // lc 316

//        int temp = 'a'; // 97

        int[] counter = new int[26];
        String s1 = "abcxyz";
        char[] chars = s1.toCharArray();
        for (char c : chars){
            counter[c-'a']++;
            /*
                97 - 97 = 0
                98 - 97 = 1
                99 - 97 = 2
             */
        }
//        String[] strArr = new String[]{"ab","c","ab"};
//        Set<String> set = new HashSet<>(Arrays.asList(strArr));
//        System.out.println(set);

        String s = "bcabc";
//        s = "bbcaac";
        String res = removeDuplicateLetters(s);
        System.out.println(res); // bac
    }

    public static String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int[] counter = new int[26];
        boolean[] used = new boolean[26];
        for (char c : chars){
            counter[c-'a']++;
        }
        // "bbcaac"
        // a:2 b:2 c:2
        for (int i = 0; i<chars.length; i++){
            char curr = chars[i];

            if (used[curr-'a']){
                counter[curr-'a']--;
                continue;
            }
            used[curr-'a'] = true;

            // 有東西 + 下大 + 後面還有
            while (!stack.isEmpty() && stack.peek()>curr && counter[stack.peek()-'a']>0){
                char temp = stack.pop();
                used[temp-'a'] = false;
            }

            stack.push(curr);
            counter[curr-'a']--;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack){
            sb.append(c);
        }
        return sb.toString();
    }

    /*
    有bug
        public static String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int[] counter = new int[26];
        boolean[] used = new boolean[26];
        for (char c : chars){
            counter[c-'a']++;
        }
        // "bcabc"
        // a:1 b:2 c:2


        for (int i = 0; i<chars.length; i++){

            for (char mark : stack){
                used[mark-'a'] = true;
            }

            char curr = chars[i];

            if (stack.isEmpty()){
                stack.push(curr);
                counter[curr-'a']--;
            } else {
                char prev = chars[i-1];
                if (!used[curr-'a'] && curr>prev && counter[curr-'a'] > 0){
                    stack.push(curr);
                    counter[curr-'a']--;
                } else {
                    char top = stack.peek();
                    while (top>curr && counter[top-'a']>0){
                        stack.pop();
                        if (stack.isEmpty())
                            break;
                        top = stack.peek();
                    }

                    stack.push(curr);
                    counter[curr-'a']--;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
     */

}
