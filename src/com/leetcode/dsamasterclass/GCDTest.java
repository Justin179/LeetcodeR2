package com.leetcode.dsamasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDTest {

    @Test
    void findGCD() {
        // gcd(8,12) = 4
        assertEquals(4,GCD.findGCD(8,12));
        // gcd(48,18) = 6
        assertEquals(6,GCD.findGCD(48,18));
    }
}