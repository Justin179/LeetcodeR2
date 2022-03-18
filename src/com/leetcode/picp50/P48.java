package com.leetcode.picp50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P48 {
    /*
        Input: n = 4
        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
     */
    public static void main(String[] args) {
        List<List<String>> res = solveNQueens(4);
        System.out.println(res);
    }

    // static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        // init the board
        char[][] board = new char[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        int i = 0;
        // red lines
        Set<Integer> minusDiagonal = new HashSet<>(); // i - j
        Set<Integer> plusDiagonal = new HashSet<>(); // i + j
        Set<Integer> vertical = new HashSet<>();
        placeQueenDfs(board, res, i, minusDiagonal, plusDiagonal, vertical);
        return res;
    }

    private static void placeQueenDfs(char[][] board, List<List<String>> res, int i,
                                      Set<Integer> minusDiagonal, Set<Integer> plusDiagonal, Set<Integer> vertical) {
        if (i==board.length){ // base case : save and return
            List<String> stringList = new ArrayList<>();
            for (char[] row : board){
                String str = String.valueOf(row); // ....
                stringList.add(str);
            }
            res.add(stringList);
            return;
        }
        // -------------------------------------------------
        for(int j = 0; j<board[0].length; j++){
            if (!minusDiagonal.contains(i-j) && !plusDiagonal.contains(i+j) && !vertical.contains(j)){
                minusDiagonal.add(i-j);
                plusDiagonal.add(i+j);
                vertical.add(j);
                board[i][j] = 'Q';
                placeQueenDfs(board, res, i+1, minusDiagonal, plusDiagonal, vertical);
                board[i][j] = '.';
                minusDiagonal.remove(i-j);
                plusDiagonal.remove(i+j);
                vertical.remove(j);
            }
        }

    }


    static int nQueens(int n){
        // your code here

        return 0;
    }
}
