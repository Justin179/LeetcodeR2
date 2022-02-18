package com.leetcode.dsamasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfANumberTest {

    @Test
    void getPowerOfANumber() {
        // 2,4 -> 2*2*2*2 = 16
        assertEquals(16, PowerOfANumber.getPowerOfANumber(2,4));
        assertEquals(9, PowerOfANumber.getPowerOfANumber(3,2));
    }
}