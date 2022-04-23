package com.leetcode.topinterviewqs.easy.array;

public class PlusOne {

    public static void main(String[] args) {
//        int[] digits = new int[]{1,2,3};
        int[] digits = new int[]{9,9,9};
//        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        // 2147483647
        // 9876543210
        System.out.println(Integer.MAX_VALUE);
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length-1; i>=0; i--){
            int curr = digits[i]; // 9
            if(curr+carry > 9){
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = curr+carry;
                carry = 0;
            }
        }

        if (carry==1){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        } else {
            return digits;
        }
    }



}
