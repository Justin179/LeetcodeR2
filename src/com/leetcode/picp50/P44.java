package com.leetcode.picp50;

public class P44 {
    /*
        Input: values = [20, 15, 25, 10], weights = [6, 5, 10, 3], maxWeight = 10
        Output: 30
     */
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

    private static int knap(int index, int maxWeight, int[] values, int[] weights) {
//        int currVal = values[index];    // 10
//        int currWt = weights[index];    // 3

        if (index >= values.length) // 出界
            return 0;
        else if (weights[index]>maxWeight)
            return knap(index+1, maxWeight, values,weights);
        else {
            int get = values[index] + knap(index+1, maxWeight - weights[index], values, weights);
            int notGet = knap(index+1, maxWeight, values, weights);
            return Math.max(get,notGet);
        }

    }
}







