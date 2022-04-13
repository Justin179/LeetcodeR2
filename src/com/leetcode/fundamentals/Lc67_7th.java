package com.leetcode.fundamentals;

public class Lc67_7th {
    public static void main(String[] args) {
//        String a = "1010";
//        String b = "1011";
        String a = "11";
        String b = "1";
        String res = addBinary(a,b);
        System.out.println(res);
    }
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i>=0 || j>=0){
            int aNum = 0;
            int bNum = 0;
            if (i>=0)
                aNum = Character.getNumericValue(a.charAt(i));
            if (j>=0)
                bNum = Character.getNumericValue(b.charAt(j));
            int abSum = aNum+bNum+carry; // 0 1 2 3
            int curr = abSum%2;
            sb.append(curr);
            carry = abSum/2;
            i--;
            j--;
        }

        if (carry>0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
