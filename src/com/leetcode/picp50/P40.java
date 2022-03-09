package com.leetcode.picp50;

import java.util.Collections;
import java.util.Stack;

public class P40 {

    public static void main(String[] args) {

        String num = "825563";
        int k = 2;
        String res = smallestAfterRemoving(num,k);
        System.out.println(res);
    }



    static String smallestAfterRemoving(String num, int k){
        if(k==num.length())
            return "0";

        Stack<Integer> stack = new Stack<>();

        for(char i : num.toCharArray()){ // 8 2 5 5 6 3
            int currNum = i-'0';

            while (k > 0 && !stack.isEmpty() && stack.peek() > currNum) { // 左側較大的數字打掉
                stack.pop();
                k--;
            }
            stack.push(currNum);
        }

        // 因為大的會在上面
        while (k>0){
            stack.pop();
            k--;
        }

//        for(int temp : stack){
//            System.out.println(temp);
//        }


        /*
        1
        0
        2
        0
        0
         */
        // build the final string, while removing the leading zeros.
        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        for(int digit: stack) { // 下到上取得
            if(leadingZero && digit == 0) continue;
            leadingZero = false; // 第一個數字非零即lock
            ret.append(digit);
        }

        /* return the final string  */
        if (ret.length() == 0) return "0";
        return ret.toString();




    }
}













