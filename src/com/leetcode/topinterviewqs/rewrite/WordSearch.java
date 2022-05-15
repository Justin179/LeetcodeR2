package com.leetcode.topinterviewqs.rewrite;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j<board[0].length; j++){
                if (board[i][j] == word.charAt(0) && dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int currIndex, int i, int j) {
        if (currIndex==word.length())
            return true;
        if (i<0||j<0||i>=board.length||j>=board[0].length|| board[i][j]!=word.charAt(currIndex))
            return false;

        char temp = board[i][j];
        board[i][j] = ' ';

        if (dfs(board,word,currIndex+1,i+1,j)
                || dfs(board,word,currIndex+1,i-1,j)
                || dfs(board,word,currIndex+1,i,j+1)
                || dfs(board,word,currIndex+1,i,j-1))
            return true;

        board[i][j] = temp;

        return false;
    }


}
