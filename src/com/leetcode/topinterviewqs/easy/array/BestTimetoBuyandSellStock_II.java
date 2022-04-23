package com.leetcode.topinterviewqs.easy.array;

public class BestTimetoBuyandSellStock_II {

    public int maxProfit(int[] prices) {
        int sum = 0;

        int low = 0;
        int high = 0;
        for (int i = 1; i<prices.length; i++){
            if (i==prices.length-1){
                if (prices[i]>prices[i-1]){
                    high = i;
                    sum+=prices[high]-prices[low];
                } else{
                    sum+=prices[high]-prices[low];
                }
                break; // 結算收工
            }

            if (prices[i]==prices[i-1])
                continue;
            else if (prices[i]>prices[i-1]){ // upward
                high = i;
            } else if (prices[i]<prices[i-1] ){ // downward 結算
                sum+= prices[high]-prices[low];
                low = i;
                high = i;
            }
        }


        return sum;
    }
}
