package com.funpodium.multithread;

public class Item {
    private String name;
    private int value;

    public Item(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public synchronized void accumulateValue() { // 加上synchronized
        value++;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
