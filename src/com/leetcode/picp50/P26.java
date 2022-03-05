package com.leetcode.picp50;

import java.util.Stack;

public class P26 {
    public static void main(String[] args) {
        String str = "{([])}";
        boolean res = isValid(str);
        System.out.println(res);
    }
    static boolean isValid(String str){
        // your code here
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if (c==')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else if (c==']' && !stack.isEmpty() && stack.peek()=='[')
                stack.pop();
            else if (c=='}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
        }

        return stack.size()==0;
    }

}
