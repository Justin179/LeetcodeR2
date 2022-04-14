package com.javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetToArrList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
