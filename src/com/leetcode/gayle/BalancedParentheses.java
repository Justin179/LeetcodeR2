package com.leetcode.gayle;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String str){
        if(str.length()%2!=0)
            return false;

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            } else if(c==')'&& !stack.isEmpty()&&stack.peek()=='('){
                stack.pop();
            } else if(c==']'&& !stack.isEmpty()&&stack.peek()=='['){
                stack.pop();
            } else if(c=='}'&& !stack.isEmpty()&&stack.peek()=='{'){
                stack.pop();
            }
        }

        return stack.size()==0;
    }
}
