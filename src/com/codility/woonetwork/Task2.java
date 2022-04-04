package com.codility.woonetwork;

public class Task2 {
    public static void main(String[] args) {
        String S = "022";
//        S = "23";
//        S = "0081";
        int res = solution(S);
        System.out.println(res);
    }
    /*
        給一個字串的數字，若改其中一個字元，就會成為一個被3整除的數字，
        這樣的數字有幾組?
     */
    public static int solution(String S) {
        // write your code in Java SE 8
        // 022 -> sum = 0+2+2 = 4
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            sum += S.charAt(i) - 48; // convert to number
        }

        // Store the answer
        int validCount = 0;
        if (sum % 3 == 0) // key logic
            validCount++;

        // Iterate over the range -> 0 2 2
        for (int i = 0; i < S.length(); i++) {

            // empty the spot before trying different digits below
            int remaining_sum = sum - (S.charAt(i) - 48);

            // Iterate over the range -> try 0 - 9 other than itself
            for (int j = 0; j <= 9; j++) {
                // if the change is divisible by 3 && differ from before
                // = valid change
                if ((remaining_sum + j) % 3 == 0 && j != S.charAt(i) - 48) {
                    validCount++;
                }
            }
        }

        return validCount;
    }
}
