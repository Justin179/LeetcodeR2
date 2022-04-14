package com.leetcode.fundamentals;

import java.util.LinkedList;
import java.util.List;

// 高頻 高cp
// 由這一題可以證明，理解後，用自己的邏輯實作 才是正解 (每個人的邏輯本來不一樣) (本來就不該硬背，而是理解後用自己的話講出來)
public class MyHashMap { // 706

    // 存放LinkedList的陣列
    LinkedList<Entry>[] array; // String 陣列，變成是 LinkedList<Entry> 陣列
                              // String[] strArr = new String[20];
                              // 只是把 String 改為 LinkedList<Entry> 就這樣
    int size = 769;
    public MyHashMap() {
        array = new LinkedList[size];
    }

    public void put(int key, int value) {
        int pos = key % size;
        LinkedList<Entry> entries = array[pos];
        if (entries==null){
           LinkedList<Entry> list = new LinkedList<>();
           list.add(new Entry(key,value));
           array[pos] = list;
        } else {
            for (Entry entry : entries){
                if (entry.key==key){
                    entry.value = value;
                    return;
                }
            }
            entries.add(new Entry(key,value));
        }
    }

    public int get(int key) {
        int pos = key%size;
        LinkedList<Entry> entries = array[pos];
        if (entries==null)
            return -1;

        for (Entry entry: entries){
            if (entry.key==key)
                return entry.value;
        }
        return -1;
    }
    // LinkedList<Entry>[] array
    // 用自己的邏輯實作
    public void remove(int key) { // LinkedList has a remove method
        int pos = key%size;
        LinkedList<Entry> entries = array[pos];
        if (entries==null)
            return;
        Entry entryToBeRemoved = null;
        for (Entry entry : entries){
            if (entry.key==key){
                entryToBeRemoved = entry;
            }
        }
        if (entryToBeRemoved!=null)
            entries.remove(entryToBeRemoved);
    }
}

class Entry{
    public int key;
    public int value;
    public Entry(int key, int value){
        this.key = key;
        this.value = value;
    }
}