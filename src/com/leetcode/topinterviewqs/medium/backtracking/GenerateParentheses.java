package com.leetcode.topinterviewqs.medium.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public static void main(String[] args) {
//        Stack<Character> stack = new Stack<>();
//        stack.push('(');
//        stack.push('(');
//        stack.push(')');
//        stack.push(')');
//        Iterator<Character> iterator = stack.iterator();
//        StringBuilder sb = new StringBuilder();
//        while (iterator.hasNext()){
//            sb.append(iterator.next());
//        }
//        System.out.println(sb.toString());
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }

    static List<String> res = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        if (n==0)
            return res;

        Stack<Character> stack = new Stack<>();
        backtrack(stack,n,0,0);

        return res;
    }

    private static void backtrack(Stack<Character> stack, int n, int open, int close) {
        // base case
        if (open==n && close==n){
            Iterator<Character> iterator = stack.iterator();
            StringBuilder sb = new StringBuilder();
            while (iterator.hasNext()){
                sb.append(iterator.next());
            }
//            System.out.println(sb.toString());
            res.add(sb.toString());
            return;
        }

        if (open<n){
            stack.push('(');
            backtrack(stack,n,open+1,close);
            stack.pop();
        }
        if (close<open){
            stack.push(')');
            backtrack(stack,n,open,close+1);
            stack.pop();
        }
    }
}




















