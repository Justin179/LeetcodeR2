package com.leetcode.topinterviewqs.easy.array2;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {
//        int[] digits = new int[]{1,2,3};
        int[] digits = new int[]{9,9,9};
        int[] res = plusOne(digits);
        System.out.println(res);
    }

    public static int[] plusOne(int[] digits) {
//        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        int carry = 0;
        for (int i = digits.length-1; i>=0; i--){
            int curr = digits[i];
            int sum = 0;
            if (i==digits.length-1){
                sum = curr+1;
            } else {
                sum = curr+carry;
            }
            if (sum>9){
                carry = 1;
//                digits[i] = sum%10;
                list.add(sum%10);
            } else {
                carry = 0;
//                digits[i] = sum;
                list.add(sum);
            }
        }
        if (carry==1){
            list.add(1);
        }

        int[] res = new int[list.size()];
        int j = 0;
        for (int i = list.size()-1; i>=0; i--){
            res[j++] = list.get(i);
        }

        return res;
    }

}
