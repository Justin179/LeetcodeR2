package com.leetcode.topinterviewqs.easy.others;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // "()[]{}"
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char curr : chars) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((curr == ')' && top == '(') || (curr == '}' && top == '{') || (curr == ']' && top == '[')) {
                    stack.pop();
                    continue;
                }
            }

            stack.push(curr);
        }

        return stack.isEmpty();
    }
}
