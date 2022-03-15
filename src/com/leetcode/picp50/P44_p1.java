package com.leetcode.picp50;

public class P44_p1 {

    public static void main(String[] args) {
        int[] values = new int[]{20, 15, 25, 10};
        int[] weights = new int[]{6, 5, 10, 3};
        int maxWeight = 10;
        int res = knapsack(values,weights,maxWeight);
        System.out.println(res); // 30
    }

    static int knapsack(int[] values, int[] weights, int maxWeight){
        //your code here
        return knap(0, maxWeight, values, weights);
    }
    /*                   0   1   2   3
        Input: values = [20, 15, 25, 10], weights = [6, 5, 10, 3], maxWeight = 10
        Output: 30
     */
    private static int knap(int index, int maxWeight, int[] values, int[] weights) {
        // 3, 4
        // 10, 3

        if(index>=values.length)
            return 0;
        else if (weights[index] > maxWeight) // 重量quota已用完，只能往下走
            return knap(index+1, maxWeight, values,weights);
        else { // 還有重量quota
            int take = values[index] + knap(index+1, maxWeight-weights[index], values,weights);
            int notTake = knap(index+1, maxWeight, values,weights);
            return Math.max(take,notTake);
        }

    }
}







