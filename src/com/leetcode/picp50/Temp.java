package com.leetcode.picp50;

import java.util.ArrayList;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        System.out.println(0%2); // 0
        System.out.println(1%2); // 1

        for (int i = 0; i<100; i++){
            System.out.println(i);
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.stream()
                .filter(a -> a.equals("a"))
                .findFirst()
                .orElse(null);



    }
}
