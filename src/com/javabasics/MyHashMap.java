package com.javabasics;

import java.util.Map;

public class MyHashMap<K,V> {

    private final int SIZE = 5;
    private Entry<K,V>[] table;

    public MyHashMap(){
        table = new Entry[SIZE];
    }

    public void put(K key, V value){
        int hash = key.hashCode()%SIZE;
        Entry<K,V> e = table[hash];
        if (e==null){
            table[hash] = new Entry<K,V>(key,value);
        } else {
            while (e.next!=null){ // 這樣e這個pointer會一路走到最後一個節點
                if (e.getKey()==key){
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey()==key){
                e.setValue(value);
                return;
            }
            e.next = new Entry<K,V>(key,value);
        }
    }

    public V get(K key){
        int hash = key.hashCode()%SIZE;
        Entry<K,V> entry = table[hash];
        if (entry==null)
            return null;
        while (entry!=null){
            if (entry.getKey()==key)
                return entry.getValue();
            entry = entry.next;
        }
        return null;
    }

    public Entry<K,V> remove(K key){
        int hash = key.hashCode()%SIZE;
        Entry<K,V> entry = table[hash];
        if (entry==null)
            return null;

        if (entry.getKey()==key){
            table[hash] = entry.next;
            entry.next = null;
            return entry;
        }
        Entry<K,V> prev = entry;
        entry = entry.next;
        while (entry!=null){
            if (entry.getKey()==key){
                prev.next = entry.next;
                entry.next = null;
                return entry;
            }
        }
        return null;
    }

    private class Entry<K,V>{
        private K key;
        private V value;
        private Entry<K,V> next;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public void setKey(K key) {
            this.key = key;
        }
        public void setValue(V value) {
            this.value = value;
        }
    }
}
