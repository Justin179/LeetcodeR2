package com.ubiquiti;


import java.util.Stack;

public class Q5_p2 {

    public static void main(String[] args) { // lc 206
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
    // assume there is only one number missing
//    public static int missingNumber(int[] nums) {
//        int sum1 = 0;
//        for (int i = 1; i<=100; i++){
//            sum1+=i;
//        }
//        int sum2 = 0;
//        for (int i : nums){
//            sum2+=i;
//        }
//        return Math.abs(sum1-sum2);
//    }
}
