package com.leetcode.yks11;

public class OA {

    public static void main(String[] args) {
        isOneAway("aaa", "abc");
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        // case 1: 長度差>=2 的 return false
        // case 2: 長度一樣的
        // case 3-1: 長度差一的s1>s2
        // case 3-2: 長度差一的s2>s1
        int s1Length = s1.length();
        int s2Length = s2.length();

        if(Math.abs(s1Length-s2Length)>=2)
            return false;
        else if (s1Length==s2Length)
            return isOneAwaySameLength(s1,s2);
        else if (s1Length == (s2Length+1))
            return isOneAwayDiffLengths(s1,s2);
        else
            return isOneAwayDiffLengths(s2,s1);

    }

    // abcd
    // abfd
    public static Boolean isOneAwaySameLength(String s1, String s2) {
        int diff_counter = 0;
        for(int i = 0; i<s1.length(); i++){

            if(s1.charAt(i) != s2.charAt(i))
                diff_counter++;

            if(diff_counter>1)
                return false;
        }
        return true;
    }

    // Assumption: s1.length() == s2.length() + 1
    // 012
    // abcde
    // abde
    public static Boolean isOneAwayDiffLengths(String s1, String s2) {
        int diff_counter = 0;
        int i = 0;
        while(i<s2.length()){
            if(s1.charAt(i+diff_counter) == s2.charAt(i))
                i++;
            else {
                diff_counter++;
            }
            if(diff_counter>1)
                return false;
        }
        return true;
    }






//    // Implement your solution below.
//    public static Boolean isOneAway(String s1, String s2) {
//        if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2) {
//            return false;
//        } else if (s1.length() == s2.length()) {
//            return isOneAwaySameLength(s1, s2);
//        } else if (s1.length() > s2.length()) {
//            return isOneAwayDiffLengths(s1, s2);
//        } else {
//            return isOneAwayDiffLengths(s2, s1);
//        }
//    }
//
//    public static Boolean isOneAwaySameLength(String s1, String s2) {
//        int countDiff = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                countDiff += 1;
//                if (countDiff > 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    // Assumption: s1.length() == s2.length() + 1
//    public static Boolean isOneAwayDiffLengths(String s1, String s2) {
//        int i = 0;
//        int countDiff = 0;
//        while (i < s2.length()) {
//            if (s1.charAt(i + countDiff) == s2.charAt(i)) {
//                i += 1;
//            } else {
//                countDiff += 1;
//            }
//            if (countDiff > 1) {
//                return false;
//            }
//        }
//        return true;
//    }
}
