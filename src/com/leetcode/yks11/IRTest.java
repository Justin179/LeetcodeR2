package com.leetcode.yks11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IRTest {

    @Test
    void testIR(){
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 =  {1, 2, 3, 4, 5, 6, 7};

//        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
//        // isRotation(array1, array2a) should return false.
//        assertEquals(false, IR.isRotation(array1,array2a));

        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        assertEquals(true, IR.isRotation(array1,array2b));

        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        assertEquals(false, IR.isRotation(array1,array2c));

        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        assertEquals(false, IR.isRotation(array1,array2d));

        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        assertEquals(false, IR.isRotation(array1,array2e));

        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
        assertEquals(true, IR.isRotation(array1,array2f));
    }

}