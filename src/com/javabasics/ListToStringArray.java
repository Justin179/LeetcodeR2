package com.javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListToStringArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test2");
        String[] strArr = list.toArray(new String[list.size()]);
        System.out.println(strArr);

    }
}
