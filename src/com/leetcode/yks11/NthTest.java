package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTest {

    @Test
    void nthFromLast() {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

//         nthFromLast(head, 1) should return 1.
//         nthFromLast(head, 5) should return 5.
//         nthFromLast(head2, 2) should return 3.
//         nthFromLast(head2, 4) should return 1.
//         nthFromLast(head2, 5) should return null.
//         nthFromLast(null, 1) should return null.

        assertEquals(1,Nth.nthFromLast(head,1).value);
        assertEquals(5,Nth.nthFromLast(head,5).value);
        assertEquals(3,Nth.nthFromLast(head2,2).value);
        assertEquals(1,Nth.nthFromLast(head2,4).value);
        assertEquals(null,Nth.nthFromLast(head2,5));
        assertEquals(null,Nth.nthFromLast(null,1));

    }

}