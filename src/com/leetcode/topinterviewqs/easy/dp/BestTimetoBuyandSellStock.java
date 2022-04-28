package com.leetcode.topinterviewqs.easy.dp;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        // 7,1,5,3,6,4

        int currentSum = 0;
        int maxProfit = 0;
        for (int i = 1; i<prices.length; i++){
            currentSum += prices[i]-prices[i-1];
            if (currentSum<0)
                currentSum = 0;
            maxProfit = Math.max(maxProfit,currentSum);
        }


        return maxProfit;
    }

}
