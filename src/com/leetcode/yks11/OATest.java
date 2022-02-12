package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OATest {

    @Test
    void isOneAway() {
        assertEquals(true, OA.isOneAway("abcde", "abcd"));  	// should return true
        assertEquals(true, OA.isOneAway("abde", "abcde"));  	// should return true
        assertEquals(true, OA.isOneAway("a", "a"));  		    // should return true
        assertEquals(true, OA.isOneAway("abcdef", "abqdef"));  	// should return true
        assertEquals(true, OA.isOneAway("abcdef", "abccef"));  	// should return true
        assertEquals(true, OA.isOneAway("abcdef", "abcde"));  	// should return true
        assertEquals(false, OA.isOneAway("aaa", "abc"));  	    // should return false
        assertEquals(false, OA.isOneAway("abcde", "abc"));  	// should return false
        assertEquals(false, OA.isOneAway("abc", "abcde"));  	// should return false
        assertEquals(false, OA.isOneAway("abc", "bcc"));  	    // should return false
    }
}