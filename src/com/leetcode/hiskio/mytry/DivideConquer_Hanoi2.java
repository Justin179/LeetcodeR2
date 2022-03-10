package com.leetcode.hiskio.mytry;

import java.util.Stack;

public class DivideConquer_Hanoi2 {
    static Stack<Integer> pillar_A = new Stack<>();
    static Stack<Integer> pillar_B = new Stack<>();
    static Stack<Integer> pillar_C = new Stack<>();

    public static void main(String[] args) {
        /** initialization **/
        pillar_A.add(5);
        pillar_A.add(4);
        pillar_A.add(3);
        pillar_A.add(2);
        pillar_A.add(1);

        int layer = pillar_A.size();

        /** Divide & Conquer **/
        hanoi(layer, pillar_A, pillar_B, pillar_C);

        System.out.println();
    }

    private static void hanoi(int disks, Stack<Integer> pillar_from, Stack<Integer> pillar_mid, Stack<Integer> pillar_to) {
        if(disks==0)
            return;
        // move 2 to the middle
        hanoi(disks-1,pillar_from,pillar_to,pillar_mid);
        Integer disk = pillar_from.pop();
        pillar_to.push(disk);
        hanoi(disks-1,pillar_mid,pillar_from,pillar_to);
    }
}
