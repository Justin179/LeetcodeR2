package com.javabasics.essentials;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Iterator<Character> iterator = set.iterator();

        // 為何是用while呢? 因為HashSet沒有順序性 no index
        while (iterator.hasNext()){
            Character next = iterator.next();
        }
    }
}
