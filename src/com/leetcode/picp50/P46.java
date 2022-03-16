package com.leetcode.picp50;

import java.util.HashSet;
import java.util.Set;

public class P46 {
    public static void main(String[] args) {
        int amount = 15;
        Set<Integer> coins = new HashSet<>();
        coins.add(2);
        coins.add(3);
        coins.add(7);
        int res = coinChange(amount,coins);
        System.out.println(res);
    }

    static int coinChange(int amount, Set<Integer> coins){
        int minCoins = coinChangeRec(amount, coins);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    static int coinChangeRec(int amount, Set<Integer> coins){
        if(amount == 0)
            return 0;
        int minCoins = Integer.MAX_VALUE;
        for(Integer coin : coins){
            if((amount-coin) >= 0){
                // in Java we need to check if the result returned by the recursive call
                // isn't equal to Integer.MAX_VALUE, to avoid overflow when we add 1
                int recursiveResult = coinChangeRec(amount-coin, coins);
                if(recursiveResult != Integer.MAX_VALUE)
                    minCoins = Math.min(minCoins, 1 + recursiveResult);
            }
        }
        return minCoins;
    }
}
