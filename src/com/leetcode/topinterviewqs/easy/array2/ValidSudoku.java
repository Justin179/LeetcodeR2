package com.leetcode.topinterviewqs.easy.array2;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int i = 0; i<board.length; i++){
            for (int j = 0; j<board[0].length; j++){
                char curr = board[i][j];
                if (curr!='.'){
                    //  If this set already contains the element, the call leaves the set unchanged and returns false.
                    boolean res1 = seen.add(curr+" found in row " +i);
                    boolean res2 = seen.add(curr+" found in column " +j);
                    boolean res3 = seen.add(curr+" found in box " + i/3 + "-" + j/3);
                    if (!res1 || !res2 || !res3)
                        return false;
                }
            }
        }

        return true;
    }
}
