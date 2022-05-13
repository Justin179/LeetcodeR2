package com.leetcode.topinterviewqs.medium.backtracking;

public class WordSearch {

    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        int rowLen = board.length;
        int colLen = board[0].length;
        for (int i = 0; i<rowLen; i++){
            for (int j = 0; j<colLen; j++){
                if (board[i][j] == word.charAt(0) && dfs(board,word,0,i,j))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (word.length()==index){
            return true;
        }
        if (i<0||j<0||i>=board.length||j>=board[0].length|| board[i][j]!=word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        if (dfs(board,word,index+1,i+1,j)||dfs(board,word,index+1,i-1,j)
                ||dfs(board,word,index+1,i,j+1)||dfs(board,word,index+1,i,j-1)){
            return true;
        }
        board[i][j] = temp;
        return false;
    }
}
























