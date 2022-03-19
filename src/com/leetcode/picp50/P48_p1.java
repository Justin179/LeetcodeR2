package com.leetcode.picp50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P48_p1 {
    /*
        Input: n = 4
        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
     */
    public static void main(String[] args) {
        List<List<String>> res = solveNQueens(4);
        System.out.println(res);
    }

    public static List<List<String>> solveNQueens(int n) {
        // init the board
        char[][] board = new char[n][n];
        for (int i = 0; i<n; i++)
            for (int j = 0; j<n; j++)
                board[i][j] = '.';

        List<List<String>> res = new ArrayList<>();
        Set<Integer> plusDiagonal = new HashSet<>();
        Set<Integer> minusDiagonal = new HashSet<>();
        Set<Integer> vertical = new HashSet<>();
        int i = 0;
        placeQueenDfs(board, i, res, plusDiagonal, minusDiagonal, vertical);

        return res;
    }

    private static void placeQueenDfs(char[][] board, int i, List<List<String>> res,
                                      Set<Integer> plusDiagonal, Set<Integer> minusDiagonal, Set<Integer> vertical) {
        if(i==board.length){ // base case: save and return
            List<String> stringList = new ArrayList<>();
            for (char[] chars : board){
                String aRow = String.valueOf(chars);
                stringList.add(aRow);
            }
            res.add(stringList);
            return;
        }
        // ------------------------
        for (int j = 0; j<board[0].length; j++){
            if(!plusDiagonal.contains(i+j) && !minusDiagonal.contains(i-j) && !vertical.contains(j)){
                board[i][j] = 'Q';
                plusDiagonal.add(i+j);
                minusDiagonal.add(i-j);
                vertical.add(j);
                placeQueenDfs(board,i+1, res, plusDiagonal, minusDiagonal, vertical);
                board[i][j] = '.';
                plusDiagonal.remove(i+j);
                minusDiagonal.remove(i-j);
                vertical.remove(j);
            }
        }
    }


}
