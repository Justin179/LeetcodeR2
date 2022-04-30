package com.leetcode.topinterviewqs.easy.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CountPrimes {

    public static void main(String[] args) {
        int n = 10;
        boolean[] isPrime = new boolean[n]; // index 0 - 19 (實數 1 - 20)
        // 直接把index視為數字
        for (int i = 0; i<n; i++){
            isPrime[i] = true;
        }

        for (int i = 2; i*i<n; i++){
            if (isPrime[i]){
                for (int j = i; i*j<n; j++){
                    isPrime[i*j] = false;
                }
            }
        }

        int counter = 0;
        for (int i = 2; i<n; i++){
            if (isPrime[i])
                counter++;
        }

        System.out.println(counter);
    }

    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n]; // index 0 - 19 (實數 1 - 20)
        // 直接把index視為數字
        for (int i = 0; i<n; i++){
            isPrime[i] = true;
        }

        for (int i = 2; i*i<n; i++){
            if (isPrime[i]){
                for (int j = i; i*j<n; j++){
                    isPrime[i*j] = false;
                }
            }
        }

        int counter = 0;
        for (int i = 2; i<n; i++){
            if (isPrime[i])
                counter++;
        }

        return counter;
    }
}
