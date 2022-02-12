package com.leetcode.btbswe.comparingdigits;

public class IntegerToBinary {

    // Main Driver Code
    public static void main(String[] args)
    {
        // Entered number to be convert into binary
        int num = 14; // 45;

        // Calling Our Above Function
        decimalToBinary(num);
    }

    public static void decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        // To convert an integer to binary divide the number by 2 until it becomes 0.
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Iteration over array to Print Binary
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }


}
