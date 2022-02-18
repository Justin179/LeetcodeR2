package com.leetcode.dsamasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @Test
    void toBinary() {
        assertEquals("1010",DecimalToBinary.toBinary(10,null));
        assertEquals("1101",DecimalToBinary.toBinary(13, null));
    }
}