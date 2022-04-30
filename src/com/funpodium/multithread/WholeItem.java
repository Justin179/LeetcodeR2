package com.funpodium.multithread;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WholeItem {
    private static final Set<Item> items = Collections.synchronizedSet(new HashSet<>());
    static {
        items.add(new Item("A", 0));
        items.add(new Item("B", 0));
        items.add(new Item("C", 0));
        items.add(new Item("D", 0));
    }

    private static WholeItem instance = null;

    private WholeItem() {}

    public static WholeItem getInstance() {
        if (instance == null) {
            instance = new WholeItem();
        }
        return instance;

    }

    public void add (String name) {
        // 移除原本的synchronized block
        for (Item i : items) {
            if (i.getName().equals(name)) {
                i.accumulateValue();
            }
        }

    }

    public Set<Item> getItems() {
        return items;
    }
}
