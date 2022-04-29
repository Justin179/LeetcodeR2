package com.leetcode.topinterviewqs.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        List<String> list = fizzBuzz(5);
        System.out.println(list);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i<=n; i++){ // 1 2 3 4 5
            if (i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if (i%3==0){
                list.add("Fizz");
            }else if (i%5==0){
                list.add("Buzz");
            }else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
