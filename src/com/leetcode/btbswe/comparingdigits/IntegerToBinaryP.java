package com.leetcode.btbswe.comparingdigits;

public class IntegerToBinaryP {

    // Main Driver Code
    public static void main(String[] args)
    {
        // Entered number to be convert into binary
        int num = 45;

        // Calling Our Above Function
        decimalToBinary(num);
    }

    public static void decimalToBinary(int num)
    {
        int[] intArr = new int[35];
        int index = 0;
        // 123
        while(num!=0){
            intArr[index++] = num%2; // 3 2 1
            num/=2;
        }

        System.out.println(intArr);
        // 3 2 1 -> 0 1 2
        for(int i = index-1; i>=0; i--){
            System.out.print(intArr[i]+"");
        }
    }


}
