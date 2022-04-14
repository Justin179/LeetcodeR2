package com.leetcode.fundamentals;

import java.util.LinkedList;

// 高頻 高cp
public class MyHashMap2 { // 706

    LinkedList<Entry>[] list; // String 陣列，變成是 LinkedList<Entry> 陣列
                              // String[] strArr = new String[20];
                              // 只是把 String 改為 LinkedList<Entry> 就這樣
    int size = 769;
    public MyHashMap2() {
        list = new LinkedList[size];
    }

    public void put(int key, int value) {

    }

    public int get(int key) {

        return 0;
    }

    public void remove(int key) {

    }
}

class Entry2{
    public int key;
    public int value;
    public Entry2(int key, int value){
        this.key = key;
        this.value = value;
    }
}