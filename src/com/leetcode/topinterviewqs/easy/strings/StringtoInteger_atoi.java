package com.leetcode.topinterviewqs.easy.strings;

public class StringtoInteger_atoi { // ascii to integer

    public static void main(String[] args) {
        String s = "   -42";
//        s = "0032"; // ab32c5
//        s = "ab320a";
//        s = "words and 987";
        s = "+42";
        s = "42";
        s = "  -42";
        s = "+-12";
        s = "+";

//        int temp = Integer.parseInt(s);
//        System.out.println(temp);

        int res = myAtoi(s);
        System.out.println(res);

//        int res = myAtoi(s);
//        System.out.println(res);
    }

    /*
        int a = 'a'; // 97 - 122
        int A = 'A'; // 65 - 90   -> +32
        0 - 9 // 48 - 57
        + 43
        - 45
     */
    public static int myAtoi(String str) { // 數字、字母、空白、+ - .

        // trim
        // 長度為0 return 0
        str = str.trim();
        if (str.length()==0)
            return 0;

        // 判斷正負，並向前走一格
        int isNegative = 1;
        int position = 0;
        if (str.charAt(0)=='+'){
            position++;
        } else if (str.charAt(0)=='-'){
            isNegative = -1;
            position++;
        }

        // for loop (用轉數字*10位移的方式)
        long res = 0;
        for (int i = position; i<str.length(); i++){ // 42ab
            if (!Character.isDigit(str.charAt(i))){
                return (int) res*isNegative; // 轉到非數字，即刻掉頭
            }
            res = res*10 + str.charAt(i)-'0';

            if (res*isNegative>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (res*isNegative<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) res*isNegative;
    }

}

/*
The algorithm for myAtoi(string s) is as follows:

1 Read in and ignore any leading whitespace.
2 Check if the next character (if not already at the end of the string) is '-' or '+'.
  Read this character in if it is either. This determines if the final result is negative or positive respectively.
  Assume the result is positive if neither is present.

3 Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
  123a -> 123

4 Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
  If no digits were read, then the integer is 0.
  Change the sign as necessary (from step 2).

5 If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range.
  Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
  Return the integer as the final result.

去前置空白
看是否有加號、減號，若沒有的話，就預設為正



Note:
Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.



    public static int myAtoi(String s) { // 數字、字母、空白、+ - .

        // 1 去空白
        s = s.trim();
        if (s.length()==0)
            return 0;

        boolean isNegative = false;
        char[] chars = s.toCharArray();
        if(chars[0] == '-'){
            isNegative = true;
            s = s.substring(1);
        } else if (chars[0] == '+'){
            s = s.substring(1);
        }
        if (s.length()==0)
            return 0;

        int firstAscii = s.charAt(0);
        // 48 - 57 -> 0-9
        if (firstAscii<48 || firstAscii>57)
            return 0;

        // 找出第一碼為非零數字的index
        chars = s.toCharArray(); // 0032, ab32
        int startIndex = 0;
        for (int i = 0; i<chars.length; i++){ // 0 1 2 3
            int currAscii = chars[i];
            if (currAscii>=49 && currAscii<=57){ // 1-9
                startIndex = i;
                break;
            }
        }

        s = s.substring(startIndex); // s 為1-9開頭的字串
//        System.out.println(s);
        chars = s.toCharArray(); // 320a

        int endIndex = chars.length;
        for (int i = 0; i<chars.length; i++){
            int currAscii = chars[i];
            if (currAscii<48 || currAscii>57){ // 非0-9
                endIndex = i;
                break;
            }
        }

        s = s.substring(0,endIndex);
        if (isNegative)
            s = "-"+s;
//        System.out.println(s);
        long bigNum = Long.parseLong(s);
        if (bigNum>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (bigNum<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return (int) bigNum;
    }
 */