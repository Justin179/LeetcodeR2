package com.synergies;

import java.util.Scanner;

public class InterviewPrep {
    public static void main(String[] args) {

        int num = 30;
        int temp = num;
        for (int i = 2; i<=temp; i++){ // 2 - 30
            if (num%i == 0){
                num = num / i;
                System.out.print(i + " ");
                if (num==0)
                    break;
            }
        }



















        // 每個合數都可以寫成幾個質數相乘的形式，其中每個質數都是這個合數的因數，
        // 把一個合數用質因數相乘的形式表示出來，叫做分解質因數。如30=2×3×5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("輸入一個整數");
//        int num = scanner.nextInt();
//        System.out.print(num + "=");
//        for (int k = 2; k <= num; k++) {
//            while (num != k) {
//                if (num % k == 0) {
//                    System.out.print(k + "*");
//                    num /= k;
//                } else {
//                    break;
//                }
//            }
//
//        }
//        System.out.print(num);
//    }





//        int max = Integer.MAX_VALUE;
//        System.out.println(max);
//        System.out.println(max+1);
//        System.out.println(Integer.MIN_VALUE-1);
        /*
            If it overflows, it goes back to the minimum value and continues from there.
            If it underflows, it goes back to the maximum value and continues from there.
         */
    }
    /*
    Example (Overflow)
        Consider the case of int variable, it is of 32 bit and any value which is more than Integer.MAX_VALUE (2147483647) is rolled over.
        For example, Integer.MAX_VALUE + 1 returns -2147483648 (Integer.MIN_VALUE).
        As int data type is 32 bit in Java, any value that surpasses 32 bits gets rolled over.
        In numerical terms, it means that after incrementing 1 on Integer.MAX_VALUE (2147483647), the returned value will be -2147483648.
        In fact, you don't need to remember these values and the constants Integer.MIN_VALUE and Integer.MAX_VALUE can be used.
        Underflow of int

        Underflow is the opposite of overflow. While we reach the upper limit in case of overflow, we reach the lower limit in case of underflow.
        Thus after decrementing 1 from Integer.MIN_VALUE, we reach Integer.MAX_VALUE.
        Here we have rolled over from the lowest value of int to the maximum value.
        For non-integer based data types, the overflow and underflow result in INFINITY and ZERO values.
     */
}
