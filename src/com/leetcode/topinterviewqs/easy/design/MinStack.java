package com.leetcode.topinterviewqs.easy.design;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

    if (!minStack.isEmpty()){
            if (val <= minStack.peek().intValue())
                minStack.push(val);
        } else
            minStack.push(val);

        stack.push(val);
    }

    public void pop() {
        if (!stack.isEmpty()){
            int popped = stack.peek();
            if (!minStack.isEmpty()){
                if (minStack.peek().intValue()==popped)
                    minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
