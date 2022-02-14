package com.leetcode.gayle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {

    @Test
    void isBalanced() {
        // balanced
        String case1 = "{}()[{}]";
        String case2 = "[({})]";
        String case3 = "({[]})";
        // unbalanced
        String case4 = "[({)}]";
        String case5 = "({[})";
        String case6 = "()}[]";

        assertEquals(true, BalancedParentheses.isBalanced(case1));
        assertEquals(true, BalancedParentheses.isBalanced(case2));
        assertEquals(true, BalancedParentheses.isBalanced(case3));
        assertEquals(false, BalancedParentheses.isBalanced(case4));
        assertEquals(false, BalancedParentheses.isBalanced(case5));
        assertEquals(false, BalancedParentheses.isBalanced(case6));

    }
}