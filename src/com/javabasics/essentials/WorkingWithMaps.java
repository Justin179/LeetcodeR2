package com.javabasics.essentials;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        // 有個keySet可以用
        for (int key : map.keySet()){
            System.out.println(map.get(key));
        }
        // Java 8有更文明的loop over
        map.forEach((k,v)->{
            System.out.println("key: "+k+", value: "+v);
        });

    }
}
