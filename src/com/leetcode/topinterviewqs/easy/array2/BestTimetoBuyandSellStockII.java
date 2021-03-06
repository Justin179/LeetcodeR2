package com.leetcode.topinterviewqs.easy.array2;

public class BestTimetoBuyandSellStockII {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i<prices.length; i++){
            int spread = prices[i] - prices[i-1];
            if (spread>0)
                sum+=spread;
        }
        return sum;
    }
}
