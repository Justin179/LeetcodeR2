package com.leetcode.topinterviewqs.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j<board[0].length; j++){
                char curr = board[i][j];
                // 每個點，都同時具有三個身份 row column which subBox
                // HashSet add() 加時會check, 若已經加過的(重複) return false
                // the function will return False if the element is already present in the HashSet.
                if (curr!='.'){
                    boolean res1 = set.add(curr+" row: "+i); // 沒有重複，才會放入
                    boolean res2 = set.add(curr+" column: "+j);
                    boolean res3 = set.add(curr+" sub row: "+i/3+" sub column: "+j/3);
                    if (res1==false || res2==false || res3==false) // 任一重複
                        return false;
                }
            }
        }

        return true;
    }

}
/*
["8","3",".",".","7",".",".",".","."],
["6",".",".","1","9","5",".",".","."],
[".","9","8",".",".",".",".","6","."],
["8",".",".",".","6",".",".",".","3"],
["4",".",".","8",".","3",".",".","1"],
["7",".",".",".","2",".",".",".","6"],
[".","6",".",".",".",".","2","8","."],
[".",".",".","4","1","9",".",".","5"],
[".",".",".",".","8",".",".","7","9"]]
 */