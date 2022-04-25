package com.leetcode.topinterviewqs.easy.strings;

public class ValidPalindrome {

    public static void main(String[] args) {

//        int space = ' ';
//        System.out.println(space);
//        int comma = ',';
//        System.out.println(comma);
//        int colon = ':';
//        System.out.println(colon);


        // due to unfamiliarity with Java -> 這意味著，不能再用我google一下就有答案的態度去應對
//        int a = 'a'; // 97 - 122
//        System.out.println(a);
//        int A = 'A'; // 65 - 90
//        System.out.println(A);

//        char upper = 'A' + 32;
//        char lower = 'a' - 32;
//        System.out.println(upper);

        // 數字char to 數字int 小技巧
//        int one = '1' - '0';
//        System.out.println(one);
        String s = "A man, a plan, a canal: Panama";
        s = "0P";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
    /*
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    int a = 'a'; // 97 - 122
    int A = 'A'; // 65 - 90   -> +32
    0 - 9 // 48 - 57
     */
    public static boolean isPalindrome(String s) {
        // 去非字母的的字元
        // 大寫變小寫
        // 數字字元也要保留
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i<chars.length; i++){
            int c = chars[i];
            if (c>=97 && c<=122){ // 小寫字母 a - z
                sb.append(chars[i]);
            } else if (c>=65 && c<=90){
                sb.append((char)(chars[i]+32));
            } else if (c>=48 && c<=57) { // 數字 0 - 9
                sb.append(chars[i]);
            } else {
                // ignore current char
            }
        }
        String newStr = sb.toString();
//        if (newStr.length()==1)
//            return true;

//        System.out.println(newStr.equals("amanaplanacanalpanama"));

        char[] charArr = newStr.toCharArray();
        int left = 0;
        int right = charArr.length-1;
        while (left<=right){
            if (charArr[left] == charArr[right]){
                left++;
                right--;
            } else
                return false;

        }

        return true;
    }
}
