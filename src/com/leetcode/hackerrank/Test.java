package com.leetcode.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
