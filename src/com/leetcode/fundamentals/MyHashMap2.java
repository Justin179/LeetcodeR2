package com.leetcode.fundamentals;

import java.util.LinkedList;

// 高頻 高cp
public class MyHashMap2 { // Lc706

    LinkedList<Entry2>[] array; // String 陣列，變成是 LinkedList<Entry> 陣列
                              // String[] strArr = new String[20];
                              // 只是把 String 改為 LinkedList<Entry> 就這樣
    int size = 769;
    public MyHashMap2() {
        array = new LinkedList[size];
    }

    public void put(int key, int value) {
        int pos = key%size;
        LinkedList<Entry2> entries = array[pos];
        if (entries==null){
            LinkedList<Entry2> temp = new LinkedList<>();
            temp.add(new Entry2(key, value));
            array[pos] = temp;
        } else {
            for (int i = 0; i<entries.size(); i++){
                Entry2 entry2 = entries.get(i);
                if (entry2.key == key){ // 有對到，更新後收工
                    entry2.value = value;
                    return;
                }
            }
            entries.add(new Entry2(key, value));
        }
    }

    public int get(int key) {
        int pos = key%size;
        LinkedList<Entry2> entries = array[pos];
        if (entries==null)
            return -1;
        else {
            for (int i = 0; i<entries.size(); i++){
                Entry2 entry2 = entries.get(i);
                if (entry2.key == key)
                    return entry2.value;
            }
            return -1;
        }
    }

    public void remove(int key) {
        int pos = key%size;
        LinkedList<Entry2> entries = array[pos];
        if (entries==null)
            return;
        else {
            for (int i = 0; i<entries.size(); i++){
                Entry2 entry2 = entries.get(i);
                if (entry2.key==key){
                    entries.remove(i);
                    return;
                }
            }
        }
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