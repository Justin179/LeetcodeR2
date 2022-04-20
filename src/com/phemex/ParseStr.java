package com.phemex;

import java.util.HashMap;
import java.util.Map;

public class ParseStr {
    /**
     String -> Int

     "100" -> 100
     "+100" -> 100
     "-100" -> -100
     "  100" -> 100
     "   +100" -> 100
     "  -100" -> -100

     "100.0" -> 100
     "100abc" -> 100
     "abc100" -> 0
     */
    public static void main(String[] args) {
        System.out.println(parse("100"));
        System.out.println(parse("+100"));
        System.out.println(parse("-100"));
        System.out.println(parse("  100"));
        System.out.println(parse("  +100"));
        System.out.println(parse("  -100"));
        System.out.println(parse("100.0"));
        System.out.println(parse("100abc"));
        System.out.println(parse("abc100"));
    }
    /*
        "abc100" -> 0
        map
        0 false
        1 false
        2 false
        3 true
        4 true
        5 true
        */
    private static int parse(String str) {
        // 去空白
        str = str.trim();
        int index = str.indexOf(".");
        // 去小數點及後面的全部
        if(index!=-1)
            str = str.substring(0,index);

        char[] chars = str.toCharArray();

        Map<Integer,Boolean> map = new HashMap();
        for (int i = 0; i<chars.length; i++){
            map.put(i,Character.isDigit(chars[i])); // key存位置 value位置是否為數字
        }

        StringBuilder sb;
        if(str.contains("-"))
            sb = new StringBuilder("-");
        else
            sb = new StringBuilder();


                /*
                chars:
            -100
            +100
            abc100
            100abc
        */
        for(int i =0; i<chars.length; i++){ // 左到右，把數字串起來

            // 數字的前一位若為字元，return 0
            if(i!=0 &&map.get(i)==true && map.get(i-1)==false){
                char c = chars[i-1];
                if(c!='-' && c!='+')
                    return 0;

            }


            if(map.get(i)){
                sb.append(chars[i]);
            }
        }

        int res = Integer.parseInt(sb.toString());

//         float f=Float.parseFloat(str);
//         System.out.println((int)f);

        return res;
    }
}
