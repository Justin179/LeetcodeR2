package com.leetcode.blind75.twenty;

public class P2_p1 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,3,5,1,6,4};
        int res = maxProfit(prices);
        System.out.println(res); // 5
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int i = 0;
        int j = 1;
        while (i<n && j<n){
            if(prices[j]-prices[i]<0){
                i++;
                j = i+1;
            } else { // 0 or above
                max = Math.max(max,prices[j]-prices[i]);
                j++;
            }

        }
        return max;
    }
}






/* 暴力解超時
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                int spread = prices[j] - prices[i];
                max = Math.max(spread,max);
            }
        }
        return Math.max(max,0);
 */
