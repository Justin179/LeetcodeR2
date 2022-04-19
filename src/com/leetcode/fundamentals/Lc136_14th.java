package com.leetcode.fundamentals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lc136_14th {

    // 這個可以，不過也學一下xor的寫法 - 效率好很多
    /*
        It takes two values and returns true if they are different;
        otherwise returns false. In binary, the true is represented by 1
        and false is represented by 0. From the above table, we can see it returns true
        if and only if both operand's values are different. Otherwise, it returns false.
        5^2 = 7

     */
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums){
            res = res ^ i;
        }
        return res;
    }

    /*
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if (!set.contains(i))
                set.add(i);
            else
                set.remove(i);
        }

        return set.iterator().next();
    }
     */
}
