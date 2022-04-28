package com.hytech;

import java.util.ArrayList;
import java.util.List;

public class MaxProfit {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // 100, 400, 2, 5, 10
        list.add(100);
        list.add(400);
        list.add(2);
        list.add(5);
        list.add(10);
//        list.add(10);
        int res = calculateMaxProfit(list);
        System.out.println(res);
    }

    // [9, 11, 8, 5, 7, 10]
    // 2 -3
    private static int calculateMaxProfit(List<Integer> list){

        int[] nums = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            nums[i] = list.get(i);
        } // O(n)


        int maxProfit = 0; // 0
        int currentSum = 0;
        for (int i = 1; i<nums.length; i++){
            int gap = nums[i] - nums[i-1]; // -3
            currentSum+=gap; // -1
            if (currentSum<0)
                currentSum = 0;

            maxProfit = Math.max(maxProfit, currentSum);
        }


        return maxProfit;
    }

}

/*
private int calculateMaxProfit(List<Integer> list)
You are given an array. Each element represents the price of a stock on that particular day.
Calculate and return the maximum profit you can make from buying and selling that stock only once.

For example: [9, 11, 8, 5, 7, 10]
Here, the optimal trade is to buy when the price is 5,
and sell when it is 10, so the return value should be 5 (profit = 10 - 5 = 5).
 */
